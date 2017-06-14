package com.daimler.aftersales.iMappers;


import com.daimler.aftersales.entity.OchartDealerDepart;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/6/13.
 */
@Component
public interface OchartDealerDepartMapper {

    void truncate();
    void insertList(List<OchartDealerDepart> ochartDealerDeparts);

}
