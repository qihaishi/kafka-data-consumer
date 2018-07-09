package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeQuestionDel;
import com.etiantian.entity.JNodeQuestionDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("jNodeQuestionDelMapper")
public interface JNodeQuestionDelMapper {
    int countByExample(JNodeQuestionDelExample example);

    int deleteByExample(JNodeQuestionDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeQuestionDel record);

    int insertSelective(JNodeQuestionDel record);

    List<JNodeQuestionDel> selectByExample(JNodeQuestionDelExample example);

    JNodeQuestionDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeQuestionDel record, @Param("example") JNodeQuestionDelExample example);

    int updateByExample(@Param("record") JNodeQuestionDel record, @Param("example") JNodeQuestionDelExample example);

    int updateByPrimaryKeySelective(JNodeQuestionDel record);

    int updateByPrimaryKey(JNodeQuestionDel record);
}