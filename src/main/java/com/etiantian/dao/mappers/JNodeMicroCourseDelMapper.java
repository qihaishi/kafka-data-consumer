package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeMicroCourseDel;
import com.etiantian.entity.JNodeMicroCourseDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JNodeMicroCourseDelMapper {
    int countByExample(JNodeMicroCourseDelExample example);

    int deleteByExample(JNodeMicroCourseDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeMicroCourseDel record);

    int insertSelective(JNodeMicroCourseDel record);

    List<JNodeMicroCourseDel> selectByExample(JNodeMicroCourseDelExample example);

    JNodeMicroCourseDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeMicroCourseDel record, @Param("example") JNodeMicroCourseDelExample example);

    int updateByExample(@Param("record") JNodeMicroCourseDel record, @Param("example") JNodeMicroCourseDelExample example);

    int updateByPrimaryKeySelective(JNodeMicroCourseDel record);

    int updateByPrimaryKey(JNodeMicroCourseDel record);
}