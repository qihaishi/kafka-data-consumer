package com.etiantian.dao.mappers;

import com.etiantian.entity.JMaterialNodeInfo;
import com.etiantian.entity.JMaterialNodeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JMaterialNodeInfoMapper {
    int countByExample(JMaterialNodeInfoExample example);

    int deleteByExample(JMaterialNodeInfoExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMaterialNodeInfo record);

    int insertSelective(JMaterialNodeInfo record);

    List<JMaterialNodeInfo> selectByExample(JMaterialNodeInfoExample example);

    JMaterialNodeInfo selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMaterialNodeInfo record, @Param("example") JMaterialNodeInfoExample example);

    int updateByExample(@Param("record") JMaterialNodeInfo record, @Param("example") JMaterialNodeInfoExample example);

    int updateByPrimaryKeySelective(JMaterialNodeInfo record);

    int updateByPrimaryKey(JMaterialNodeInfo record);
}