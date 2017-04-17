package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Staffpositiontype;
import com.daimler.aftersales.entity.StaffpositiontypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface StaffpositiontypeMapper {
    void truncate();
    int countByExample(StaffpositiontypeExample example);

    int deleteByExample(StaffpositiontypeExample example);

    int deleteByPrimaryKey(Integer staffpositiontypeid);

    int insert(Staffpositiontype record);

    int insertSelective(Staffpositiontype record);

    List<Staffpositiontype> selectByExample(StaffpositiontypeExample example);

    Staffpositiontype selectByPrimaryKey(Integer staffpositiontypeid);

    int updateByExampleSelective(@Param("record") Staffpositiontype record, @Param("example") StaffpositiontypeExample example);

    int updateByExample(@Param("record") Staffpositiontype record, @Param("example") StaffpositiontypeExample example);

    int updateByPrimaryKeySelective(Staffpositiontype record);

    int updateByPrimaryKey(Staffpositiontype record);
}