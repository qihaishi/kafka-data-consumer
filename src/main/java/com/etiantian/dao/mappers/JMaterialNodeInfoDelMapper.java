package com.etiantian.dao.mappers;

import com.etiantian.entity.JMaterialNodeInfoDel;
import com.etiantian.entity.JMaterialNodeInfoDelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JMaterialNodeInfoDelMapper {
    int countByExample(JMaterialNodeInfoDelExample example);

    int deleteByExample(JMaterialNodeInfoDelExample example);

    int deleteByPrimaryKey(Long ref);

    int insert(JMaterialNodeInfoDel record);

    int insertSelective(JMaterialNodeInfoDel record);

    List<JMaterialNodeInfoDel> selectByExample(JMaterialNodeInfoDelExample example);

    JMaterialNodeInfoDel selectByPrimaryKey(Long ref);

    int updateByExampleSelective(@Param("record") JMaterialNodeInfoDel record, @Param("example") JMaterialNodeInfoDelExample example);

    int updateByExample(@Param("record") JMaterialNodeInfoDel record, @Param("example") JMaterialNodeInfoDelExample example);

    int updateByPrimaryKeySelective(JMaterialNodeInfoDel record);

    int updateByPrimaryKey(JMaterialNodeInfoDel record);
}