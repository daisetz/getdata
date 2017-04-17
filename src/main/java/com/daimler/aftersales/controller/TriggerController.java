package com.daimler.aftersales.controller;

import com.daimler.aftersales.entity.LoginInfo;
import com.daimler.aftersales.scheduler.ScheduleTasks;
import com.daimler.aftersales.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuyuchao on 2017/4/12.
 */
@RestController
public class TriggerController {

    @Autowired
    private ScheduleTasks scheduleTasks;

    @RequestMapping("/fetch")
    public String triggerTasks(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                scheduleTasks.getDate();
            }
        }).start();
        return "Fetch data started!";
    }

    @Autowired
    private ILoginService iLoginService;
    @Autowired
    private LoginInfo loginInfo;

    @RequestMapping("/login")
    public String loginTest(){
        iLoginService.login();
        return loginInfo.getToken();
    }

}
