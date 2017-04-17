package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.DealerPOJO;
import org.springframework.stereotype.Component;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
@Component
public interface IDealerDao {

    void truncate();
    void insertDealerData(DealerPOJO dealerPOJO);

}
