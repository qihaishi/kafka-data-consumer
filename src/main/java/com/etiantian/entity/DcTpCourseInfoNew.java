package com.etiantian.entity;

import java.util.Date;

public class DcTpCourseInfoNew {
    private Long courseId;

    private Long ref;

    private String courseName;

    private Long resPkgId;

    private Long parentId;

    private Long rootId;

    private String routeId;

    private String routeName;

    private Integer level;

    private Long status;

    private Integer cUserId;

    private Date cTime;

    private Date mTime;

    private Integer mUserId;

    private Date ggsTime;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Long getResPkgId() {
        return resPkgId;
    }

    public void setResPkgId(Long resPkgId) {
        this.resPkgId = resPkgId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
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

    public Integer getmUserId() {
        return mUserId;
    }

    public void setmUserId(Integer mUserId) {
        this.mUserId = mUserId;
    }

    public Date getGgsTime() {
        return ggsTime;
    }

    public void setGgsTime(Date ggsTime) {
        this.ggsTime = ggsTime;
    }
}