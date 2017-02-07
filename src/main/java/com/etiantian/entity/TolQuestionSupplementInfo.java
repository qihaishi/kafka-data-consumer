package com.etiantian.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TolQuestionSupplementInfo {
    private BigDecimal ref;

    private BigDecimal questionId;

    private Integer difficult;

    private BigDecimal standardTime;

    private Date cTime;

    private Date mTime;

    public BigDecimal getRef() {
        return ref;
    }

    public void setRef(BigDecimal ref) {
        this.ref = ref;
    }

    public BigDecimal getQuestionId() {
        return questionId;
    }

    public void setQuestionId(BigDecimal questionId) {
        this.questionId = questionId;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public BigDecimal getStandardTime() {
        return standardTime;
    }

    public void setStandardTime(BigDecimal standardTime) {
        this.standardTime = standardTime;
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
}