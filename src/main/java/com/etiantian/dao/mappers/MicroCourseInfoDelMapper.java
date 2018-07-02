package com.etiantian.dao.mappers;

import com.etiantian.entity.MicroCourseInfoDel;
import com.etiantian.entity.MicroCourseInfoDelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MicroCourseInfoDelMapper {
    int countByExample(MicroCourseInfoDelExample example);

    int deleteByExample(MicroCourseInfoDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(MicroCourseInfoDel record);

    int insertSelective(MicroCourseInfoDel record);

    List<MicroCourseInfoDel> selectByExample(MicroCourseInfoDelExample example);

    MicroCourseInfoDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") MicroCourseInfoDel record, @Param("example") MicroCourseInfoDelExample example);

    int updateByExample(@Param("record") MicroCourseInfoDel record, @Param("example") MicroCourseInfoDelExample example);

    int updateByPrimaryKeySelective(MicroCourseInfoDel record);

    int updateByPrimaryKey(MicroCourseInfoDel record);
}