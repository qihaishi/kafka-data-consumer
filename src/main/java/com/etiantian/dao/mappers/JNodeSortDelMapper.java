package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeSortDel;
import com.etiantian.entity.JNodeSortDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("jNodeSortDelMapper")
public interface JNodeSortDelMapper {
    int countByExample(JNodeSortDelExample example);

    int deleteByExample(JNodeSortDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeSortDel record);

    int insertSelective(JNodeSortDel record);

    List<JNodeSortDel> selectByExample(JNodeSortDelExample example);

    JNodeSortDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeSortDel record, @Param("example") JNodeSortDelExample example);

    int updateByExample(@Param("record") JNodeSortDel record, @Param("example") JNodeSortDelExample example);

    int updateByPrimaryKeySelective(JNodeSortDel record);

    int updateByPrimaryKey(JNodeSortDel record);
}