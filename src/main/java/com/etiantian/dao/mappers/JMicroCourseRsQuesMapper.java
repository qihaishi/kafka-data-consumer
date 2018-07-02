package com.etiantian.dao.mappers;

import com.etiantian.entity.JMicroCourseRsQues;
import com.etiantian.entity.JMicroCourseRsQuesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("jMicroCourseRsQuesMapper")
public interface JMicroCourseRsQuesMapper {
    int countByExample(JMicroCourseRsQuesExample example);

    int deleteByExample(JMicroCourseRsQuesExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMicroCourseRsQues record);

    int insertSelective(JMicroCourseRsQues record);

    List<JMicroCourseRsQues> selectByExample(JMicroCourseRsQuesExample example);

    JMicroCourseRsQues selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMicroCourseRsQues record, @Param("example") JMicroCourseRsQuesExample example);

    int updateByExample(@Param("record") JMicroCourseRsQues record, @Param("example") JMicroCourseRsQuesExample example);

    int updateByPrimaryKeySelective(JMicroCourseRsQues record);

    int updateByPrimaryKey(JMicroCourseRsQues record);
}