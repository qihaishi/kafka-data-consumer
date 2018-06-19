package com.etiantian.entity;

import java.util.Date;

public class VersionInfo {
    private Integer ref;

    private Integer versionId;

    private String versionName;

    private String contDesc;

    private String abbreviation;

    private Integer isOnlyForPrimary;

    private Integer subjectId;

    private Integer sectionId;

    private Date cTime;

    private Integer cUserId;

    private Date mTime;

    private Integer mUserId;

    private Integer active;

    private Date ggsTime;

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName == null ? null : versionName.trim();
    }

    public String getContDesc() {
        return contDesc;
    }

    public void setContDesc(String contDesc) {
        this.contDesc = contDesc == null ? null : contDesc.trim();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public Integer getIsOnlyForPrimary() {
        return isOnlyForPrimary;
    }

    public void setIsOnlyForPrimary(Integer isOnlyForPrimary) {
        this.isOnlyForPrimary = isOnlyForPrimary;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Integer getcUserId() {
        return cUserId;
    }

    public void setcUserId(Integer cUserId) {
        this.cUserId = cUserId;
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

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getGgsTime() {
        return ggsTime;
    }

    public void setGgsTime(Date ggsTime) {
        this.ggsTime = ggsTime;
    }
}