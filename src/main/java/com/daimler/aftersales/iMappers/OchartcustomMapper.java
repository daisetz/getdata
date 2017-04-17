package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Ochartcustom;
import com.daimler.aftersales.entity.OchartcustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface OchartcustomMapper {

    void truncate();
    int countByExample(OchartcustomExample example);

    int deleteByExample(OchartcustomExample example);

    int deleteByPrimaryKey(Long ochartid);

    int insert(Ochartcustom record);

    int insertSelective(Ochartcustom record);

    List<Ochartcustom> selectByExample(OchartcustomExample example);

    Ochartcustom selectByPrimaryKey(Long ochartid);

    int updateByExampleSelective(@Param("record") Ochartcustom record, @Param("example") OchartcustomExample example);

    int updateByExample(@Param("record") Ochartcustom record, @Param("example") OchartcustomExample example);

    int updateByPrimaryKeySelective(Ochartcustom record);

    int updateByPrimaryKey(Ochartcustom record);
}