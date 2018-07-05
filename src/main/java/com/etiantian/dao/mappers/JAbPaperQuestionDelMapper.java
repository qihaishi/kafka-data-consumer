package com.etiantian.dao.mappers;

import com.etiantian.entity.JAbPaperQuestionDel;
import com.etiantian.entity.JAbPaperQuestionDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("jAbPaperQuestionDelMapper")
public interface JAbPaperQuestionDelMapper {
    int countByExample(JAbPaperQuestionDelExample example);

    int deleteByExample(JAbPaperQuestionDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JAbPaperQuestionDel record);

    int insertSelective(JAbPaperQuestionDel record);

    List<JAbPaperQuestionDel> selectByExample(JAbPaperQuestionDelExample example);

    JAbPaperQuestionDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JAbPaperQuestionDel record, @Param("example") JAbPaperQuestionDelExample example);

    int updateByExample(@Param("record") JAbPaperQuestionDel record, @Param("example") JAbPaperQuestionDelExample example);

    int updateByPrimaryKeySelective(JAbPaperQuestionDel record);

    int updateByPrimaryKey(JAbPaperQuestionDel record);
}