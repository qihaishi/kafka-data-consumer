package com.etiantian.dao.mappers;

import com.etiantian.entity.MaterialInfoDel;
import com.etiantian.entity.MaterialInfoDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialInfoDelMapper {
    int countByExample(MaterialInfoDelExample example);

    int deleteByExample(MaterialInfoDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(MaterialInfoDel record);

    int insertSelective(MaterialInfoDel record);

    List<MaterialInfoDel> selectByExample(MaterialInfoDelExample example);

    MaterialInfoDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") MaterialInfoDel record, @Param("example") MaterialInfoDelExample example);

    int updateByExample(@Param("record") MaterialInfoDel record, @Param("example") MaterialInfoDelExample example);

    int updateByPrimaryKeySelective(MaterialInfoDel record);

    int updateByPrimaryKey(MaterialInfoDel record);
}