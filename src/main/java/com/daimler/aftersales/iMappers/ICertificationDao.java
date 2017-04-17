package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.CertificationPOJO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
@Component
public interface ICertificationDao {

    void truncate();

    void insertCertificationData(CertificationPOJO certificationPOJO);

    void insertList(List<CertificationPOJO> certificationPOJOList);
}
