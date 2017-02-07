package com.etiantian.dao.mappers;

import com.etiantian.entity.TolQuestionSupplementInfo;
import com.etiantian.entity.TolQuestionSupplementInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TolQuestionSupplementInfoMapper {
    int countByExample(TolQuestionSupplementInfoExample example);

    int deleteByExample(TolQuestionSupplementInfoExample example);

    int deleteByPrimaryKey(BigDecimal ref);

    int insert(TolQuestionSupplementInfo record);

    int insertSelective(TolQuestionSupplementInfo record);

    List<TolQuestionSupplementInfo> selectByExample(TolQuestionSupplementInfoExample example);

    TolQuestionSupplementInfo selectByPrimaryKey(BigDecimal ref);

    int updateByExampleSelective(@Param("record") TolQuestionSupplementInfo record, @Param("example") TolQuestionSupplementInfoExample example);

    int updateByExample(@Param("record") TolQuestionSupplementInfo record, @Param("example") TolQuestionSupplementInfoExample example);

    int updateByPrimaryKeySelective(TolQuestionSupplementInfo record);

    int updateByPrimaryKey(TolQuestionSupplementInfo record);
}