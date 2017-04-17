package com.daimler.aftersales.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/1.
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public SimpleClientHttpRequestFactory getSimpleClientHttpRequestFactoryBean() {
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setConnectTimeout(600000);
        simpleClientHttpRequestFactory.setReadTimeout(600000);
        return simpleClientHttpRequestFactory;
    }

    @Bean
    public RestTemplate getRestTemplate(SimpleClientHttpRequestFactory simpleClientHttpRequestFactory) {
        RestTemplate restTemplate = new RestTemplate(simpleClientHttpRequestFactory);
        List<HttpMessageConverter<?>> list = new ArrayList();
        list.add(new FormHttpMessageConverter());
        list.add(new MappingJackson2XmlHttpMessageConverter());
        list.add(new MappingJackson2HttpMessageConverter());
        StringHttpMessageConverter stringHttpMessageConverter =  new StringHttpMessageConverter(Charset.forName("UTF-8"));
        list.add(stringHttpMessageConverter);
        restTemplate.setMessageConverters(list);
        return restTemplate;
    }
}
