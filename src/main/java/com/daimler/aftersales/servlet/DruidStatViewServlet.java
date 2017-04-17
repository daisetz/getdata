package com.daimler.aftersales.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by zhuyuchao on 2017/2/28.
 */
@WebServlet(urlPatterns = "/druid/*")
public class DruidStatViewServlet extends StatViewServlet{
}
