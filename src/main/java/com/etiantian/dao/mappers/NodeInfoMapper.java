package com.etiantian.dao.mappers;

import com.etiantian.entity.NodeInfo;
import com.etiantian.entity.NodeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeInfoMapper {
    int countByExample(NodeInfoExample example);

    int deleteByExample(NodeInfoExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(NodeInfo record);

    int insertSelective(NodeInfo record);

    List<NodeInfo> selectByExample(NodeInfoExample example);

    NodeInfo selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") NodeInfo record, @Param("example") NodeInfoExample example);

    int updateByExample(@Param("record") NodeInfo record, @Param("example") NodeInfoExample example);

    int updateByPrimaryKeySelective(NodeInfo record);

    int updateByPrimaryKey(NodeInfo record);
}