package com.daimler.aftersales.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
@Component
public class LoginInfo {

    private String username;
    private String password;
    private String key;
    private String token;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public void fetchDbLoginData(LoginInfo dbInfo) {
        setUsername(dbInfo.getUsername());
        setPassword(dbInfo.getPassword());
        setKey(dbInfo.getKey());
    }
}
