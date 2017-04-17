package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.RelationRegionprovince;
import com.daimler.aftersales.entity.RelationRegionprovinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface RelationRegionprovinceMapper {
    void truncate();
    int countByExample(RelationRegionprovinceExample example);

    int deleteByExample(RelationRegionprovinceExample example);

    int deleteByPrimaryKey(Integer relationid);

    int insert(RelationRegionprovince record);

    int insertSelective(RelationRegionprovince record);

    List<RelationRegionprovince> selectByExample(RelationRegionprovinceExample example);

    RelationRegionprovince selectByPrimaryKey(Integer relationid);

    int updateByExampleSelective(@Param("record") RelationRegionprovince record, @Param("example") RelationRegionprovinceExample example);

    int updateByExample(@Param("record") RelationRegionprovince record, @Param("example") RelationRegionprovinceExample example);

    int updateByPrimaryKeySelective(RelationRegionprovince record);

    int updateByPrimaryKey(RelationRegionprovince record);
}