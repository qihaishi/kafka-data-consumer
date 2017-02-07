package com.etiantian.service.inter;

/**
 * Created by yuchunfan on 2017/2/6.
 */
public interface IBaseService<T, K> {
    int doUpdate(T record, K example);

    int doInsert(T record);
}
