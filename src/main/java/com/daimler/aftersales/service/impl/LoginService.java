package com.daimler.aftersales.service.impl;

import com.daimler.aftersales.Util.DecodeUtil;
import com.daimler.aftersales.Util.JsonUtil;
import com.daimler.aftersales.entity.LoginInfo;
import com.daimler.aftersales.service.ILoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
@Service
@PropertySource({"classpath:ApiUrl.properties","classpath:loginInfo.properties"})
public class LoginService implements ILoginService {

    private static Logger logger = Logger.getLogger(ILoginService.class);

    @Value("${dic.api.url.Login}")
    String url;
    @Value("${dic.api.username}")
    String username;
    @Value("${dic.api.password}")
    String password;
    @Value("${dic.api.key}")
    String key;

    @Autowired
    private LoginInfo loginInfo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void login() {
        MultiValueMap<String,String> requestEntity = new LinkedMultiValueMap<>();
        requestEntity.add("UserName", username);
        requestEntity.add("PassWord",password);
        logger.info("Connecting to server"+url);
        String base64 = restTemplate.postForObject(url,requestEntity,String.class);
        String json = DecodeUtil.decode(base64,key);
        Map<String,List<Object>> result = JsonUtil.getMapFromJson(json);
        loginInfo.setUsername(username);
        loginInfo.setPassword(password);
        loginInfo.setKey(key);
        loginInfo.setToken((String) result.get("TokenNo").get(0));
        if(loginInfo.getToken()!=null||!loginInfo.getToken().equals("")){
            logger.info("Login succeed! Token="+loginInfo.getToken());
        }else{
            logger.error("Login failed, retry!");
            login();
        }

    }
}
