package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeSort;
import com.etiantian.entity.JNodeSortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JNodeSortMapper {
    int countByExample(JNodeSortExample example);

    int deleteByExample(JNodeSortExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeSort record);

    int insertSelective(JNodeSort record);

    List<JNodeSort> selectByExample(JNodeSortExample example);

    JNodeSort selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeSort record, @Param("example") JNodeSortExample example);

    int updateByExample(@Param("record") JNodeSort record, @Param("example") JNodeSortExample example);

    int updateByPrimaryKeySelective(JNodeSort record);

    int updateByPrimaryKey(JNodeSort record);
}