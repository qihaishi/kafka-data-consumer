package com.etiantian.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TolNewpaperDirAssociationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TolNewpaperDirAssociationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRefIsNull() {
            addCriterion("REF is null");
            return (Criteria) this;
        }

        public Criteria andRefIsNotNull() {
            addCriterion("REF is not null");
            return (Criteria) this;
        }

        public Criteria andRefEqualTo(BigDecimal value) {
            addCriterion("REF =", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotEqualTo(BigDecimal value) {
            addCriterion("REF <>", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThan(BigDecimal value) {
            addCriterion("REF >", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REF >=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThan(BigDecimal value) {
            addCriterion("REF <", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REF <=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefIn(List<BigDecimal> values) {
            addCriterion("REF in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotIn(List<BigDecimal> values) {
            addCriterion("REF not in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF not between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andDirId1IsNull() {
            addCriterion("DIR_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andDirId1IsNotNull() {
            addCriterion("DIR_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andDirId1EqualTo(BigDecimal value) {
            addCriterion("DIR_ID1 =", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1NotEqualTo(BigDecimal value) {
            addCriterion("DIR_ID1 <>", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1GreaterThan(BigDecimal value) {
            addCriterion("DIR_ID1 >", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIR_ID1 >=", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1LessThan(BigDecimal value) {
            addCriterion("DIR_ID1 <", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIR_ID1 <=", value, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1In(List<BigDecimal> values) {
            addCriterion("DIR_ID1 in", values, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1NotIn(List<BigDecimal> values) {
            addCriterion("DIR_ID1 not in", values, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIR_ID1 between", value1, value2, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIR_ID1 not between", value1, value2, "dirId1");
            return (Criteria) this;
        }

        public Criteria andDirId2IsNull() {
            addCriterion("DIR_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andDirId2IsNotNull() {
            addCriterion("DIR_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andDirId2EqualTo(BigDecimal value) {
            addCriterion("DIR_ID2 =", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2NotEqualTo(BigDecimal value) {
            addCriterion("DIR_ID2 <>", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2GreaterThan(BigDecimal value) {
            addCriterion("DIR_ID2 >", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIR_ID2 >=", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2LessThan(BigDecimal value) {
            addCriterion("DIR_ID2 <", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIR_ID2 <=", value, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2In(List<BigDecimal> values) {
            addCriterion("DIR_ID2 in", values, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2NotIn(List<BigDecimal> values) {
            addCriterion("DIR_ID2 not in", values, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIR_ID2 between", value1, value2, "dirId2");
            return (Criteria) this;
        }

        public Criteria andDirId2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIR_ID2 not between", value1, value2, "dirId2");
            return (Criteria) this;
        }

        public Criteria andAssociationIsNull() {
            addCriterion("ASSOCIATION is null");
            return (Criteria) this;
        }

        public Criteria andAssociationIsNotNull() {
            addCriterion("ASSOCIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAssociationEqualTo(BigDecimal value) {
            addCriterion("ASSOCIATION =", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotEqualTo(BigDecimal value) {
            addCriterion("ASSOCIATION <>", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationGreaterThan(BigDecimal value) {
            addCriterion("ASSOCIATION >", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSOCIATION >=", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationLessThan(BigDecimal value) {
            addCriterion("ASSOCIATION <", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSOCIATION <=", value, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationIn(List<BigDecimal> values) {
            addCriterion("ASSOCIATION in", values, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotIn(List<BigDecimal> values) {
            addCriterion("ASSOCIATION not in", values, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSOCIATION between", value1, value2, "association");
            return (Criteria) this;
        }

        public Criteria andAssociationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSOCIATION not between", value1, value2, "association");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("C_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("C_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("C_TIME >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterionForJDBCDate("C_TIME <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterionForJDBCDate("C_TIME in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_TIME not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TIME between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TIME not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("M_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("M_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("M_TIME >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterionForJDBCDate("M_TIME <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterionForJDBCDate("M_TIME in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("M_TIME not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_TIME between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_TIME not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andCalDateIsNull() {
            addCriterion("CAL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCalDateIsNotNull() {
            addCriterion("CAL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCalDateEqualTo(String value) {
            addCriterion("CAL_DATE =", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateNotEqualTo(String value) {
            addCriterion("CAL_DATE <>", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateGreaterThan(String value) {
            addCriterion("CAL_DATE >", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_DATE >=", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateLessThan(String value) {
            addCriterion("CAL_DATE <", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateLessThanOrEqualTo(String value) {
            addCriterion("CAL_DATE <=", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateLike(String value) {
            addCriterion("CAL_DATE like", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateNotLike(String value) {
            addCriterion("CAL_DATE not like", value, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateIn(List<String> values) {
            addCriterion("CAL_DATE in", values, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateNotIn(List<String> values) {
            addCriterion("CAL_DATE not in", values, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateBetween(String value1, String value2) {
            addCriterion("CAL_DATE between", value1, value2, "calDate");
            return (Criteria) this;
        }

        public Criteria andCalDateNotBetween(String value1, String value2) {
            addCriterion("CAL_DATE not between", value1, value2, "calDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}