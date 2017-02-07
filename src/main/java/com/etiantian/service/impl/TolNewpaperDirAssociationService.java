package com.etiantian.service.impl;

import com.etiantian.dao.mappers.TolNewpaperDirAssociationMapper;
import com.etiantian.entity.TolNewpaperDirAssociation;
import com.etiantian.entity.TolNewpaperDirAssociationExample;
import com.etiantian.service.inter.ITolNewpaperDirAssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Created by yuchunfan on 2017/2/6.
 */
@Service
public class TolNewpaperDirAssociationService extends BaseService<TolNewpaperDirAssociation, TolNewpaperDirAssociationExample> implements ITolNewpaperDirAssociationService {

    @Autowired
    TolNewpaperDirAssociationMapper tolNewpaperDirAssociationMapper;

    public int doUpdate(TolNewpaperDirAssociation record, TolNewpaperDirAssociationExample example) {
        int affectRows = tolNewpaperDirAssociationMapper.updateByExampleSelective(record,example);
        if(affectRows<1) {
            affectRows = doInsert(record);
        }
        return affectRows;
    }

    public int doInsert(TolNewpaperDirAssociation record) {
        return tolNewpaperDirAssociationMapper.insertSelective(record);
    }
}
