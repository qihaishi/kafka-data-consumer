package com.etiantian.dao.mappers;

import com.etiantian.entity.DcTpCourseInfoNew;
import com.etiantian.entity.DcTpCourseInfoNewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DcTpCourseInfoNewMapper {
    int countByExample(DcTpCourseInfoNewExample example);

    int deleteByExample(DcTpCourseInfoNewExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(DcTpCourseInfoNew record);

    int insertSelective(DcTpCourseInfoNew record);

    List<DcTpCourseInfoNew> selectByExample(DcTpCourseInfoNewExample example);

    DcTpCourseInfoNew selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") DcTpCourseInfoNew record, @Param("example") DcTpCourseInfoNewExample example);

    int updateByExample(@Param("record") DcTpCourseInfoNew record, @Param("example") DcTpCourseInfoNewExample example);

    int updateByPrimaryKeySelective(DcTpCourseInfoNew record);

    int updateByPrimaryKey(DcTpCourseInfoNew record);
}