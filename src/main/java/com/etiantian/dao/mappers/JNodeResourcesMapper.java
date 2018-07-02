package com.etiantian.dao.mappers;

import com.etiantian.entity.JNodeResources;
import com.etiantian.entity.JNodeResourcesExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("jNodeResourcesMapper")
public interface JNodeResourcesMapper {
    int countByExample(JNodeResourcesExample example);

    int deleteByExample(JNodeResourcesExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JNodeResources record);

    int insertSelective(JNodeResources record);

    List<JNodeResources> selectByExample(JNodeResourcesExample example);

    JNodeResources selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JNodeResources record, @Param("example") JNodeResourcesExample example);

    int updateByExample(@Param("record") JNodeResources record, @Param("example") JNodeResourcesExample example);

    int updateByPrimaryKeySelective(JNodeResources record);

    int updateByPrimaryKey(JNodeResources record);
}