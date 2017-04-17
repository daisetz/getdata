package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.BrandPOJO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/3/1.
 */
@Component
public interface IBrandDao {

    void truncate();

    void insertBrandData(BrandPOJO brandPOJO);
}
