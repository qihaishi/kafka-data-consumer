package com.etiantian.dao.mappers;

import com.etiantian.entity.VersionInfo;
import com.etiantian.entity.VersionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionInfoMapper {
    int countByExample(VersionInfoExample example);

    int deleteByExample(VersionInfoExample example);

    int deleteByPrimaryKey(Integer ref);

    int insert(VersionInfo record);

    int insertSelective(VersionInfo record);

    List<VersionInfo> selectByExample(VersionInfoExample example);

    VersionInfo selectByPrimaryKey(Integer ref);

    int updateByExampleSelective(@Param("record") VersionInfo record, @Param("example") VersionInfoExample example);

    int updateByExample(@Param("record") VersionInfo record, @Param("example") VersionInfoExample example);

    int updateByPrimaryKeySelective(VersionInfo record);

    int updateByPrimaryKey(VersionInfo record);
}