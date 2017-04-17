package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.CMSAccountPOJO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
@Component
public interface ICMSAccountDao {

    void truncate();
    void insertCMSAccountData(CMSAccountPOJO cmsAccountPOJO);
    void insertList(List<CMSAccountPOJO> cmsAccountPOJO);

}
