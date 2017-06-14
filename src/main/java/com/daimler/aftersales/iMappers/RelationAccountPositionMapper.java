package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.RelationAccountPositionPOJO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhuyuchao on 2017/6/13.
 */
@Component
public interface RelationAccountPositionMapper {
    void truncate();
    void insertList(List<RelationAccountPositionPOJO> relations);

}
