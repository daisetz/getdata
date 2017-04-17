package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dimissionreason;
import com.daimler.aftersales.entity.DimissionreasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DimissionreasonMapper {
    void truncate();
    int countByExample(DimissionreasonExample example);

    int deleteByExample(DimissionreasonExample example);

    int deleteByPrimaryKey(Integer dimissionreasonid);

    int insert(Dimissionreason record);

    int insertSelective(Dimissionreason record);

    List<Dimissionreason> selectByExample(DimissionreasonExample example);

    Dimissionreason selectByPrimaryKey(Integer dimissionreasonid);

    int updateByExampleSelective(@Param("record") Dimissionreason record, @Param("example") DimissionreasonExample example);

    int updateByExample(@Param("record") Dimissionreason record, @Param("example") DimissionreasonExample example);

    int updateByPrimaryKeySelective(Dimissionreason record);

    int updateByPrimaryKey(Dimissionreason record);
}