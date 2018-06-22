package com.etiantian.entity;

import java.util.Date;

public class NodeInfo {
    private Long ref;

    private Long id;

    private String name;

    private Integer gradeId;

    private Integer subjectId;

    private Date cTime;

    private Date mTime;

    private Long cUserId;

    private Long mUserId;

    private Integer enable;

    private Long parentId;

    private Long rootId;

    private String routeId;

    private String routeName;

    private Date ggsTime;

    private Integer level;

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
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

    public Date getGgsTime() {
        return ggsTime;
    }

    public void setGgsTime(Date ggsTime) {
        this.ggsTime = ggsTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}