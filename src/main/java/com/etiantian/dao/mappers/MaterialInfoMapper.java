package com.etiantian.dao.mappers;

import com.etiantian.entity.MaterialInfo;
import com.etiantian.entity.MaterialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialInfoMapper {
    int countByExample(MaterialInfoExample example);

    int deleteByExample(MaterialInfoExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(MaterialInfo record);

    int insertSelective(MaterialInfo record);

    List<MaterialInfo> selectByExample(MaterialInfoExample example);

    MaterialInfo selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

    int updateByExample(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

    int updateByPrimaryKeySelective(MaterialInfo record);

    int updateByPrimaryKey(MaterialInfo record);
}