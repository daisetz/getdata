package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dealergroup;
import com.daimler.aftersales.entity.DealergroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DealergroupMapper {
    void truncate();
    int countByExample(DealergroupExample example);

    int deleteByExample(DealergroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dealergroup record);

    int insertSelective(Dealergroup record);

    List<Dealergroup> selectByExample(DealergroupExample example);

    Dealergroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dealergroup record, @Param("example") DealergroupExample example);

    int updateByExample(@Param("record") Dealergroup record, @Param("example") DealergroupExample example);

    int updateByPrimaryKeySelective(Dealergroup record);

    int updateByPrimaryKey(Dealergroup record);
}