package com.daimler.aftersales.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/*",initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter {
}
