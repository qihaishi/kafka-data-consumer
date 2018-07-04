package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeMicroCourse;
import com.etiantian.entity.JNodeMicroCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JNodeMicroCourseMapper {
    int countByExample(JNodeMicroCourseExample example);

    int deleteByExample(JNodeMicroCourseExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeMicroCourse record);

    int insertSelective(JNodeMicroCourse record);

    List<JNodeMicroCourse> selectByExample(JNodeMicroCourseExample example);

    JNodeMicroCourse selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeMicroCourse record, @Param("example") JNodeMicroCourseExample example);

    int updateByExample(@Param("record") JNodeMicroCourse record, @Param("example") JNodeMicroCourseExample example);

    int updateByPrimaryKeySelective(JNodeMicroCourse record);

    int updateByPrimaryKey(JNodeMicroCourse record);
}