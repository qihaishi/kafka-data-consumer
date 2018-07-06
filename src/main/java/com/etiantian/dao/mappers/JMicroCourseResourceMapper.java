package com.etiantian.dao.mappers;

import com.etiantian.entity.JMicroCourseResource;
import com.etiantian.entity.JMicroCourseResourceExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("jMicroCourseResourceMapper")
public interface JMicroCourseResourceMapper {
    int countByExample(JMicroCourseResourceExample example);

    int deleteByExample(JMicroCourseResourceExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMicroCourseResource record);

    int insertSelective(JMicroCourseResource record);

    List<JMicroCourseResource> selectByExample(JMicroCourseResourceExample example);

    JMicroCourseResource selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMicroCourseResource record, @Param("example") JMicroCourseResourceExample example);

    int updateByExample(@Param("record") JMicroCourseResource record, @Param("example") JMicroCourseResourceExample example);

    int updateByPrimaryKeySelective(JMicroCourseResource record);

    int updateByPrimaryKey(JMicroCourseResource record);
}