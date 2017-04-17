package com.daimler.aftersales;



import com.daimler.aftersales.Util.JsonUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.util.List;
import java.util.Map;

/**
 * Created by zhuyuchao on 2017/3/1.
 */
public class JsonTest {

    public static void main(String[] args){
        String s = "{\"TotalCount\":4,\"Page\":1,\"PageSize\":20,\"Key\":\"[\\\"BrandID\\\",\\\"BrandNameCn\\\",\\\"BrandIconCn\\\",\\\"BrandNameEn\\\",\\\"BrandIconEn\\\",\\\"Sort\\\",\\\"ShortName\\\"]\",\"Data\":\"[[\\\"1002\\\",\\\"梅赛德斯-奔驰\\\",\\\"/images/logo_benz_s.jpg\\\",\\\"Mercedes-Benz\\\",\\\"/images/logo_benz_s.jpg\\\",\\\"10\\\",\\\"\\\"],[\\\"1004\\\",\\\"smart\\\",\\\"/images/logo_smart_s.jpg\\\",\\\"smart\\\",\\\"/images/logo_smart_s.jpg\\\",\\\"20\\\",\\\"\\\"],[\\\"1005\\\",\\\"星睿二手车\\\",\\\"/images/logo_xr.jpg\\\",\\\"StarElite\\\",\\\"/images/logo_xr_en.jpg\\\",\\\"30\\\",\\\"\\\"],[\\\"1006\\\",\\\"AMG\\\",\\\"/images/logo_Mercedes-AMG.jpg\\\",\\\"AMG\\\",\\\"/images/logo_Mercedes-AMG.jpg\\\",\\\"40\\\",\\\"\\\"]]\"}";

        JSONObject object = new JSONObject().fromObject(s);

        JSONArray array = (JSONArray) JSONSerializer.toJSON(object.get("Key"));
        System.out.println(array.getString(0));

        Map map = JsonUtil.getMapFromJson(s);
        System.out.println(((List)((List)map.get("Data")).get(0)).get(0));

    }

}
