package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.CityPOJO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
@Component
public interface ICityDao {

    void truncate();

    void insertCityData(CityPOJO cityPOJO);


}
