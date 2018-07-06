package com.etiantian.dao.mappers;

import com.etiantian.entity.JAbPaperQuestion;
import com.etiantian.entity.JAbPaperQuestionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("jAbPaperQuestionMapper")
public interface JAbPaperQuestionMapper {
    int countByExample(JAbPaperQuestionExample example);

    int deleteByExample(JAbPaperQuestionExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JAbPaperQuestion record);

    int insertSelective(JAbPaperQuestion record);

    List<JAbPaperQuestion> selectByExample(JAbPaperQuestionExample example);

    JAbPaperQuestion selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JAbPaperQuestion record, @Param("example") JAbPaperQuestionExample example);

    int updateByExample(@Param("record") JAbPaperQuestion record, @Param("example") JAbPaperQuestionExample example);

    int updateByPrimaryKeySelective(JAbPaperQuestion record);

    int updateByPrimaryKey(JAbPaperQuestion record);
}