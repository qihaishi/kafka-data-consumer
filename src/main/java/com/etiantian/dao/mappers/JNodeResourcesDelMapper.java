package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeResourcesDel;
import com.etiantian.entity.JNodeResourcesDelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("jNodeResourcesDelMapper")
public interface JNodeResourcesDelMapper {
    int countByExample(JNodeResourcesDelExample example);

    int deleteByExample(JNodeResourcesDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeResourcesDel record);

    int insertSelective(JNodeResourcesDel record);

    List<JNodeResourcesDel> selectByExample(JNodeResourcesDelExample example);

    JNodeResourcesDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeResourcesDel record, @Param("example") JNodeResourcesDelExample example);

    int updateByExample(@Param("record") JNodeResourcesDel record, @Param("example") JNodeResourcesDelExample example);

    int updateByPrimaryKeySelective(JNodeResourcesDel record);

    int updateByPrimaryKey(JNodeResourcesDel record);
}