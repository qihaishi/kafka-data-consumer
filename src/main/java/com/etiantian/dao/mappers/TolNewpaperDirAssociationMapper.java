package com.etiantian.dao.mappers;

import com.etiantian.entity.TolNewpaperDirAssociation;
import com.etiantian.entity.TolNewpaperDirAssociationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TolNewpaperDirAssociationMapper {
    int countByExample(TolNewpaperDirAssociationExample example);

    int deleteByExample(TolNewpaperDirAssociationExample example);

    int deleteByPrimaryKey(BigDecimal ref);

    int insert(TolNewpaperDirAssociation record);

    int insertSelective(TolNewpaperDirAssociation record);

    List<TolNewpaperDirAssociation> selectByExample(TolNewpaperDirAssociationExample example);

    TolNewpaperDirAssociation selectByPrimaryKey(BigDecimal ref);

    int updateByExampleSelective(@Param("record") TolNewpaperDirAssociation record, @Param("example") TolNewpaperDirAssociationExample example);

    int updateByExample(@Param("record") TolNewpaperDirAssociation record, @Param("example") TolNewpaperDirAssociationExample example);

    int updateByPrimaryKeySelective(TolNewpaperDirAssociation record);

    int updateByPrimaryKey(TolNewpaperDirAssociation record);
}