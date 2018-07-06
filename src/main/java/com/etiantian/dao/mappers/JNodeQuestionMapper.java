package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeQuestion;
import com.etiantian.entity.JNodeQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JNodeQuestionMapper {
    int countByExample(JNodeQuestionExample example);

    int deleteByExample(JNodeQuestionExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeQuestion record);

    int insertSelective(JNodeQuestion record);

    List<JNodeQuestion> selectByExample(JNodeQuestionExample example);

    JNodeQuestion selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeQuestion record, @Param("example") JNodeQuestionExample example);

    int updateByExample(@Param("record") JNodeQuestion record, @Param("example") JNodeQuestionExample example);

    int updateByPrimaryKeySelective(JNodeQuestion record);

    int updateByPrimaryKey(JNodeQuestion record);
}