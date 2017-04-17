package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dealerowner;
import com.daimler.aftersales.entity.DealerownerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DealerownerMapper {
    void truncate();
    int countByExample(DealerownerExample example);

    int deleteByExample(DealerownerExample example);

    int deleteByPrimaryKey(Integer dealerownerid);

    int insert(Dealerowner record);

    int insertSelective(Dealerowner record);

    List<Dealerowner> selectByExample(DealerownerExample example);

    Dealerowner selectByPrimaryKey(Integer dealerownerid);

    int updateByExampleSelective(@Param("record") Dealerowner record, @Param("example") DealerownerExample example);

    int updateByExample(@Param("record") Dealerowner record, @Param("example") DealerownerExample example);

    int updateByPrimaryKeySelective(Dealerowner record);

    int updateByPrimaryKey(Dealerowner record);
}