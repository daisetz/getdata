package com.daimler.aftersales.Util;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by zhuyuchao on 2017/3/1.
 */
public class JsonUtil {

    private static final Logger logger = Logger.getLogger(JsonUtil.class);

    public static Map<String, List<Object>> getMapFromJson(String datasource) {
        Map<String, List<Object>> infoMap = new HashMap<>();
//        StringBuffer stringBuffer = new StringBuffer();
//        String[] dataSplit = datasource.split("\\\\\"\\\\\"");
//        System.out.println(datasource);
//        stringBuffer.append(dataSplit[0]);
//        for(int i=0;i<dataSplit.length-1;i++){
//            String s1 = dataSplit[i];
//            String s2 = dataSplit[i+1];
//            int s1Length = s1.length();
//            if((s1.charAt(s1Length-1)==','||s1.charAt(s1Length-1)==']'||s1.charAt(s1Length-1)=='}')
//                    &&(s2.charAt(0)==','||s2.charAt(0)=='['||s2.charAt(0)=='{')){
//                stringBuffer.append("\\\"\\\"").append(s2);
//            }else{
//                stringBuffer.append("\\\"").append(s2);
//            }
//        }
        JSONObject jsonObject = new JSONObject().fromObject(datasource);
        for (Iterator iterator = jsonObject.keySet().iterator(); iterator.hasNext(); ) {
            String key = (String) iterator.next();
            List<Object> temp = new ArrayList<>();
            if(!key.equals("Data")){
                getListFromJsonArray(jsonObject.get(key),temp);
            }else{
                temp = getDataFromString(jsonObject.getString(key),infoMap.get("Key").size());
            }
            infoMap.put(key,temp);
    }

        return infoMap;
    }

    private static List<Object> getDataFromString(String string,int size) {
        List<Object> list = new ArrayList<>();
        String[] strings = string.replace("[","").replace("]","").split("\",\"");
        for(int i=0;i<strings.length;i++){
            List<String> temp = new ArrayList<>();
            for(int j=0;j<size;j++){
                temp.add(strings[i+j].replaceAll("\"",""));
            }
            i+=size-1;
            list.add(temp);
        }
        return list;
    }

    private static boolean getListFromJsonArray(Object jsonValue,List<Object> outcome) {
        JSONArray array = null;
        try{
            array = (JSONArray) JSONSerializer.toJSON(((String)jsonValue).replaceAll("[\r\n]","").replaceAll("\\\\",""));
            for(int i=0;i<array.size();i++){
                List<Object> temp = new ArrayList<>();
                if(getListFromJsonArray(array.getString(i),temp)){
                    outcome.add(temp.get(0));
                }else{
                    outcome.add(temp);
                }
            }
            return false;
        }catch (Exception e ){
            if(jsonValue instanceof String){
                if(((String)jsonValue).contains("[")){
                    logger.error("JsonValue has a wrong syntax");
                    e.printStackTrace();
                }
            }
            outcome.add(jsonValue);
            return true;
        }
    }

}
