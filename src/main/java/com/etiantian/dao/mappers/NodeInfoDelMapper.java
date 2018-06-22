package com.etiantian.dao.mappers;

import com.etiantian.entity.NodeInfoDel;
import com.etiantian.entity.NodeInfoDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeInfoDelMapper {
    int countByExample(NodeInfoDelExample example);

    int deleteByExample(NodeInfoDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(NodeInfoDel record);

    int insertSelective(NodeInfoDel record);

    List<NodeInfoDel> selectByExample(NodeInfoDelExample example);

    NodeInfoDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") NodeInfoDel record, @Param("example") NodeInfoDelExample example);

    int updateByExample(@Param("record") NodeInfoDel record, @Param("example") NodeInfoDelExample example);

    int updateByPrimaryKeySelective(NodeInfoDel record);

    int updateByPrimaryKey(NodeInfoDel record);
}