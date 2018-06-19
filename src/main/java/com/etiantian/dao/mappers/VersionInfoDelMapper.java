package com.etiantian.dao.mappers;

import com.etiantian.entity.VersionInfoDel;
import com.etiantian.entity.VersionInfoDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionInfoDelMapper {
    int countByExample(VersionInfoDelExample example);

    int deleteByExample(VersionInfoDelExample example);

    int deleteByPrimaryKey(Integer ref);

    int insert(VersionInfoDel record);

    int insertSelective(VersionInfoDel record);

    List<VersionInfoDel> selectByExample(VersionInfoDelExample example);

    VersionInfoDel selectByPrimaryKey(Integer ref);

    int updateByExampleSelective(@Param("record") VersionInfoDel record, @Param("example") VersionInfoDelExample example);

    int updateByExample(@Param("record") VersionInfoDel record, @Param("example") VersionInfoDelExample example);

    int updateByPrimaryKeySelective(VersionInfoDel record);

    int updateByPrimaryKey(VersionInfoDel record);
}