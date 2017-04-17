package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Ochart;
import com.daimler.aftersales.entity.OchartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface OchartMapper {
    void truncate();
    int countByExample(OchartExample example);

    int deleteByExample(OchartExample example);

    int deleteByPrimaryKey(Long ochartid);

    int insert(Ochart record);

    int insertSelective(Ochart record);

    List<Ochart> selectByExample(OchartExample example);

    Ochart selectByPrimaryKey(Long ochartid);

    int updateByExampleSelective(@Param("record") Ochart record, @Param("example") OchartExample example);

    int updateByExample(@Param("record") Ochart record, @Param("example") OchartExample example);

    int updateByPrimaryKeySelective(Ochart record);

    int updateByPrimaryKey(Ochart record);

    void insertList(List<Ochart> ocharts);
}