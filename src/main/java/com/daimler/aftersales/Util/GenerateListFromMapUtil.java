package com.daimler.aftersales.Util;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
public class GenerateListFromMapUtil {

    private static Logger logger = Logger.getLogger(GenerateListFromMapUtil.class);

    public static <T> List<T> generateList(List<Object> keyList,List<Object> valueList, Class<T> destClass){
        List<T> objectList = new ArrayList<T>();
        for(int i=0;i<valueList.size();i++){
            List<Object> values = null;
            if(valueList.get(i) instanceof List){
                values = (List<Object>) valueList.get(i);
            }else{
                logger.error("valueList can not be inserted");
                continue;
            }
            try {
                T obj = destClass.newInstance();
                int count = 0;
                for(int j=0;j<values.size();j++){
                    String value = (String) values.get(j);
                    String fieldsName = (String) keyList.get(j);
                    Method[] methods = destClass.getDeclaredMethods();
                    for(Method method:methods) {
                        if (method.getName().equalsIgnoreCase("set" + fieldsName)) {
                            Class paraClass = method.getParameterTypes()[0];
                            Object castedvalue = null;
                            try {
                                castedvalue = castType(value, method);
                            }catch (Exception e){
                                logger.error("Invalid Input type for parameter "+method.getName());
                            }
                            if(castedvalue!=null){
                                method.invoke(obj, castedvalue);
                            }
                            count++;
                        }
                    }
                }
                if(count!=keyList.size()){
                    throw new Exception("POJO's fields are not defined correctly");
                }
                objectList.add(obj);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return objectList;
    }

    private static <E> Object castType(String value,Method method){
        Class aClass = method.getParameterTypes()[0];
        if(aClass.getName().equals("java.lang.Integer")){
            if(value.equals("")){
                return null;
            }else{
                return Integer.parseInt(value);
            }
        }else if(aClass.getName().equals("java.lang.Long")){
            if(value.equals("")){
                return null;
            }else{
                return Long.parseLong(value);
            }
        } else if(aClass.getName().equals("java.util.Date")){
            if(value.equals("")){
                return null;
            }
            String[] source= value.split("/");
            StringBuffer temp = new StringBuffer(source[0]).append("-");
            if(source[1].length()<2){
                temp.append("0");
            }
            temp.append(source[1]).append("-");
            if(source[2].length()<2){
                temp.append("0");
            }
            temp.append(source[2]);
            Date date = null;
            try {
                date =  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(temp.toString());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }else if(aClass.getName().equals("java.sql.Timestamp")){
            if(value.equals("")){
                return null;
            }
            String[] source= value.split("/");
            StringBuffer temp = new StringBuffer(source[0]).append("-");
            if(source[1].length()<2){
                temp.append("0");
            }
            temp.append(source[1]).append("-");
            if(source[2].length()<2){
                temp.append("0");
            }
            temp.append(source[2]);
            return Timestamp.valueOf(temp.toString());
        }else{
            return value;
        }
    }
}
