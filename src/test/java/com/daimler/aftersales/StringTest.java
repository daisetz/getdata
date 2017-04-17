package com.daimler.aftersales;

import net.sf.json.JSONObject;

/**
 * Created by zhuyuchao on 2017/3/8.
 */
public class StringTest {

    public static void main(String[] args){

        String ss="fdsaads\n\r\tfdsafsd";
        System.out.println(ss.replace("\r",""));
    }
}
