package com.etiantian.entity;

import java.util.Date;

public class JNodeResources {
    private Long ref;

    private Long resourceId;

    private Long dirId;

    private Integer itemId;

    private Integer resourceType;

    private Date cTime;

    private Date mTime;

    private Long cUserId;

    private Long mUserId;

    private Date ggsTime;

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Long getDirId() {
        return dirId;
    }

    public void setDirId(Long dirId) {
        this.dirId = dirId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Long getcUserId() {
        return cUserId;
    }

    public void setcUserId(Long cUserId) {
        this.cUserId = cUserId;
    }

    public Long getmUserId() {
        return mUserId;
    }

    public void setmUserId(Long mUserId) {
        this.mUserId = mUserId;
    }

    public Date getGgsTime() {
        return ggsTime;
    }

    public void setGgsTime(Date ggsTime) {
        this.ggsTime = ggsTime;
    }
}