package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dealerformat;
import com.daimler.aftersales.entity.DealerformatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DealerformatMapper {
    void truncate();
    int countByExample(DealerformatExample example);

    int deleteByExample(DealerformatExample example);

    int deleteByPrimaryKey(Integer formatid);

    int insert(Dealerformat record);

    int insertSelective(Dealerformat record);

    List<Dealerformat> selectByExample(DealerformatExample example);

    Dealerformat selectByPrimaryKey(Integer formatid);

    int updateByExampleSelective(@Param("record") Dealerformat record, @Param("example") DealerformatExample example);

    int updateByExample(@Param("record") Dealerformat record, @Param("example") DealerformatExample example);

    int updateByPrimaryKeySelective(Dealerformat record);

    int updateByPrimaryKey(Dealerformat record);
}