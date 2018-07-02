package com.etiantian.dao.mappers;

import com.etiantian.entity.JMicroCourseRsQuesDel;
import com.etiantian.entity.JMicroCourseRsQuesDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("jMicroCourseRsQuesDelMapper")
public interface JMicroCourseRsQuesDelMapper {
    int countByExample(JMicroCourseRsQuesDelExample example);

    int deleteByExample(JMicroCourseRsQuesDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMicroCourseRsQuesDel record);

    int insertSelective(JMicroCourseRsQuesDel record);

    List<JMicroCourseRsQuesDel> selectByExample(JMicroCourseRsQuesDelExample example);

    JMicroCourseRsQuesDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMicroCourseRsQuesDel record, @Param("example") JMicroCourseRsQuesDelExample example);

    int updateByExample(@Param("record") JMicroCourseRsQuesDel record, @Param("example") JMicroCourseRsQuesDelExample example);

    int updateByPrimaryKeySelective(JMicroCourseRsQuesDel record);

    int updateByPrimaryKey(JMicroCourseRsQuesDel record);
}