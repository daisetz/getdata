package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.CompanyPOJO;
import org.springframework.stereotype.Component;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
@Component
public interface ICompanyDao {

    void truncate();
    void insertCompanyData(CompanyPOJO companyPOJO);
}
