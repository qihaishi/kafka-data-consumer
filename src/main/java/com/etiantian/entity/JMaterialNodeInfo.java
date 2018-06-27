package com.etiantian.entity;

import java.util.Date;

public class JMaterialNodeInfo {
    private Long ref;

    private Long listId;

    private Long dirId;

    private String listDirName;

    private Integer orderId;

    private Date ggsTime;

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public String getListDirName() {
        return listDirName;
    }

    public void setListDirName(String listDirName) {
        this.listDirName = listDirName == null ? null : listDirName.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getGgsTime() {
        return ggsTime;
    }

    public void setGgsTime(Date ggsTime) {
        this.ggsTime = ggsTime;
    }
}