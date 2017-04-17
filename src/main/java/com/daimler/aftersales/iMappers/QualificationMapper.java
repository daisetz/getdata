package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Qualification;
import com.daimler.aftersales.entity.QualificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface QualificationMapper {
    void truncate();
    int countByExample(QualificationExample example);

    int deleteByExample(QualificationExample example);

    int deleteByPrimaryKey(Integer qualificationid);

    int insert(Qualification record);

    int insertSelective(Qualification record);

    List<Qualification> selectByExample(QualificationExample example);

    Qualification selectByPrimaryKey(Integer qualificationid);

    int updateByExampleSelective(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByExample(@Param("record") Qualification record, @Param("example") QualificationExample example);

    int updateByPrimaryKeySelective(Qualification record);

    int updateByPrimaryKey(Qualification record);
}