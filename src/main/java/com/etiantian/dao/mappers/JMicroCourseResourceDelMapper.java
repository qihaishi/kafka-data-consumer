package com.etiantian.dao.mappers;

import com.etiantian.entity.JMicroCourseResourceDel;
import com.etiantian.entity.JMicroCourseResourceDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("jMicroCourseResourceDelMapper")
public interface JMicroCourseResourceDelMapper {
    int countByExample(JMicroCourseResourceDelExample example);

    int deleteByExample(JMicroCourseResourceDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMicroCourseResourceDel record);

    int insertSelective(JMicroCourseResourceDel record);

    List<JMicroCourseResourceDel> selectByExample(JMicroCourseResourceDelExample example);

    JMicroCourseResourceDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMicroCourseResourceDel record, @Param("example") JMicroCourseResourceDelExample example);

    int updateByExample(@Param("record") JMicroCourseResourceDel record, @Param("example") JMicroCourseResourceDelExample example);

    int updateByPrimaryKeySelective(JMicroCourseResourceDel record);

    int updateByPrimaryKey(JMicroCourseResourceDel record);
}