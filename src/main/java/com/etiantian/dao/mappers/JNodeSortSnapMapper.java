package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeSortSnap;
import com.etiantian.entity.JNodeSortSnapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("jNodeSortSnapMapper")
public interface JNodeSortSnapMapper {
    int countByExample(JNodeSortSnapExample example);

    int deleteByExample(JNodeSortSnapExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeSortSnap record);

    int insertSelective(JNodeSortSnap record);

    List<JNodeSortSnap> selectByExample(JNodeSortSnapExample example);

    JNodeSortSnap selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeSortSnap record, @Param("example") JNodeSortSnapExample example);

    int updateByExample(@Param("record") JNodeSortSnap record, @Param("example") JNodeSortSnapExample example);

    int updateByPrimaryKeySelective(JNodeSortSnap record);

    int updateByPrimaryKey(JNodeSortSnap record);
}