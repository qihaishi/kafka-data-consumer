package com.etiantian.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TolNewpaperDirAssociation {
    private BigDecimal ref;

    private BigDecimal dirId1;

    private BigDecimal dirId2;

    private BigDecimal association;

    private Date cTime;

    private Date mTime;

    private String calDate;

    public BigDecimal getRef() {
        return ref;
    }

    public void setRef(BigDecimal ref) {
        this.ref = ref;
    }

    public BigDecimal getDirId1() {
        return dirId1;
    }

    public void setDirId1(BigDecimal dirId1) {
        this.dirId1 = dirId1;
    }

    public BigDecimal getDirId2() {
        return dirId2;
    }

    public void setDirId2(BigDecimal dirId2) {
        this.dirId2 = dirId2;
    }

    public BigDecimal getAssociation() {
        return association;
    }

    public void setAssociation(BigDecimal association) {
        this.association = association;
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

    public String getCalDate() {
        return calDate;
    }

    public void setCalDate(String calDate) {
        this.calDate = calDate == null ? null : calDate.trim();
    }
}