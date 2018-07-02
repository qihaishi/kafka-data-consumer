package com.etiantian.dao.mappers;

import com.etiantian.entity.MicroCourseInfo;
import com.etiantian.entity.MicroCourseInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MicroCourseInfoMapper {
    int countByExample(MicroCourseInfoExample example);

    int deleteByExample(MicroCourseInfoExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(MicroCourseInfo record);

    int insertSelective(MicroCourseInfo record);

    List<MicroCourseInfo> selectByExample(MicroCourseInfoExample example);

    MicroCourseInfo selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") MicroCourseInfo record, @Param("example") MicroCourseInfoExample example);

    int updateByExample(@Param("record") MicroCourseInfo record, @Param("example") MicroCourseInfoExample example);

    int updateByPrimaryKeySelective(MicroCourseInfo record);

    int updateByPrimaryKey(MicroCourseInfo record);
}