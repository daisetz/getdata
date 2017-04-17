package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dealeraccount;
import com.daimler.aftersales.entity.DealeraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DealeraccountMapper {

    void truncate();
    void insertList(List<Dealeraccount> dealeraccounts);
    int countByExample(DealeraccountExample example);

    int deleteByExample(DealeraccountExample example);

    int deleteByPrimaryKey(Integer dealeraccountid);

    int insert(Dealeraccount record);

    int insertSelective(Dealeraccount record);

    List<Dealeraccount> selectByExample(DealeraccountExample example);

    Dealeraccount selectByPrimaryKey(Integer dealeraccountid);

    int updateByExampleSelective(@Param("record") Dealeraccount record, @Param("example") DealeraccountExample example);

    int updateByExample(@Param("record") Dealeraccount record, @Param("example") DealeraccountExample example);

    int updateByPrimaryKeySelective(Dealeraccount record);

    int updateByPrimaryKey(Dealeraccount record);
}