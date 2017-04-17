package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Staffresume;
import com.daimler.aftersales.entity.StaffresumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StaffresumeMapper {
    void truncate();
    int countByExample(StaffresumeExample example);

    int deleteByExample(StaffresumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Staffresume record);

    int insertSelective(Staffresume record);

    List<Staffresume> selectByExample(StaffresumeExample example);

    Staffresume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Staffresume record, @Param("example") StaffresumeExample example);

    int updateByExample(@Param("record") Staffresume record, @Param("example") StaffresumeExample example);

    int updateByPrimaryKeySelective(Staffresume record);

    int updateByPrimaryKey(Staffresume record);

    void insertList(List<Staffresume> staffresumes);
}