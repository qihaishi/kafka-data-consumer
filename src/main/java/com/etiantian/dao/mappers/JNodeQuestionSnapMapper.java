package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeQuestionSnap;
import com.etiantian.entity.JNodeQuestionSnapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JNodeQuestionSnapMapper {
    int countByExample(JNodeQuestionSnapExample example);

    int deleteByExample(JNodeQuestionSnapExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeQuestionSnap record);

    int insertSelective(JNodeQuestionSnap record);

    List<JNodeQuestionSnap> selectByExample(JNodeQuestionSnapExample example);

    JNodeQuestionSnap selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeQuestionSnap record, @Param("example") JNodeQuestionSnapExample example);

    int updateByExample(@Param("record") JNodeQuestionSnap record, @Param("example") JNodeQuestionSnapExample example);

    int updateByPrimaryKeySelective(JNodeQuestionSnap record);

    int updateByPrimaryKey(JNodeQuestionSnap record);
}