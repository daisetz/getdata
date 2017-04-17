package com.daimler.aftersales.iMappers;

import com.daimler.aftersales.entity.Dealerformatcode;
import com.daimler.aftersales.entity.DealerformatcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface DealerformatcodeMapper {
    void truncate();
    int countByExample(DealerformatcodeExample example);

    int deleteByExample(DealerformatcodeExample example);

    int deleteByPrimaryKey(Integer formatcodeid);

    int insert(Dealerformatcode record);

    int insertSelective(Dealerformatcode record);

    List<Dealerformatcode> selectByExample(DealerformatcodeExample example);

    Dealerformatcode selectByPrimaryKey(Integer formatcodeid);

    int updateByExampleSelective(@Param("record") Dealerformatcode record, @Param("example") DealerformatcodeExample example);

    int updateByExample(@Param("record") Dealerformatcode record, @Param("example") DealerformatcodeExample example);

    int updateByPrimaryKeySelective(Dealerformatcode record);

    int updateByPrimaryKey(Dealerformatcode record);
}