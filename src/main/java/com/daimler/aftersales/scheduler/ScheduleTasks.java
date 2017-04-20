package com.daimler.aftersales.scheduler;

import com.daimler.aftersales.service.IFetchDataService;
import com.daimler.aftersales.service.ILoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * Created by zhuyuchao on 2017/2/27.
 */
@Component
public class ScheduleTasks {

    private static Logger logger = Logger.getLogger(ScheduleTasks.class);

    @Autowired
    private ILoginService loginService;

    @Autowired
    private IFetchDataService fetchDataService;

    @Scheduled(cron = "0 0 2 * * ?")
    public void getDate(){
        logger.info("Scheduled Tasks start to run!");
        loginService.login();
        fetchDataService.fetchDataManager();
        logger.info("Scheduled Tasks are finished");
    }

}
