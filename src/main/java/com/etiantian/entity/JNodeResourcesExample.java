package com.etiantian.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JNodeResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JNodeResourcesExample() {
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

        public Criteria andRefIsNull() {
            addCriterion("ref is null");
            return (Criteria) this;
        }

        public Criteria andRefIsNotNull() {
            addCriterion("ref is not null");
            return (Criteria) this;
        }

        public Criteria andRefEqualTo(Long value) {
            addCriterion("ref =", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotEqualTo(Long value) {
            addCriterion("ref <>", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThan(Long value) {
            addCriterion("ref >", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThanOrEqualTo(Long value) {
            addCriterion("ref >=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThan(Long value) {
            addCriterion("ref <", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThanOrEqualTo(Long value) {
            addCriterion("ref <=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefIn(List<Long> values) {
            addCriterion("ref in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotIn(List<Long> values) {
            addCriterion("ref not in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefBetween(Long value1, Long value2) {
            addCriterion("ref between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotBetween(Long value1, Long value2) {
            addCriterion("ref not between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Long value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Long value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Long value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Long value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Long> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Long> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Long value1, Long value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andDirIdIsNull() {
            addCriterion("dir_id is null");
            return (Criteria) this;
        }

        public Criteria andDirIdIsNotNull() {
            addCriterion("dir_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirIdEqualTo(Long value) {
            addCriterion("dir_id =", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotEqualTo(Long value) {
            addCriterion("dir_id <>", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdGreaterThan(Long value) {
            addCriterion("dir_id >", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dir_id >=", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdLessThan(Long value) {
            addCriterion("dir_id <", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdLessThanOrEqualTo(Long value) {
            addCriterion("dir_id <=", value, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdIn(List<Long> values) {
            addCriterion("dir_id in", values, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotIn(List<Long> values) {
            addCriterion("dir_id not in", values, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdBetween(Long value1, Long value2) {
            addCriterion("dir_id between", value1, value2, "dirId");
            return (Criteria) this;
        }

        public Criteria andDirIdNotBetween(Long value1, Long value2) {
            addCriterion("dir_id not between", value1, value2, "dirId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andIsDirectIsNull() {
            addCriterion("is_direct is null");
            return (Criteria) this;
        }

        public Criteria andIsDirectIsNotNull() {
            addCriterion("is_direct is not null");
            return (Criteria) this;
        }

        public Criteria andIsDirectEqualTo(Integer value) {
            addCriterion("is_direct =", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotEqualTo(Integer value) {
            addCriterion("is_direct <>", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectGreaterThan(Integer value) {
            addCriterion("is_direct >", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_direct >=", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectLessThan(Integer value) {
            addCriterion("is_direct <", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectLessThanOrEqualTo(Integer value) {
            addCriterion("is_direct <=", value, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectIn(List<Integer> values) {
            addCriterion("is_direct in", values, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotIn(List<Integer> values) {
            addCriterion("is_direct not in", values, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectBetween(Integer value1, Integer value2) {
            addCriterion("is_direct between", value1, value2, "isDirect");
            return (Criteria) this;
        }

        public Criteria andIsDirectNotBetween(Integer value1, Integer value2) {
            addCriterion("is_direct not between", value1, value2, "isDirect");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(Integer value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(Integer value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(Integer value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(Integer value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<Integer> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<Integer> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterion("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterion("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterion("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterion("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterion("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterion("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterion("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterion("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterion("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("c_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("c_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(Long value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Long value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Long value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Long value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Long value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Long> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Long> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Long value1, Long value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Long value1, Long value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdIsNull() {
            addCriterion("m_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMUserIdIsNotNull() {
            addCriterion("m_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMUserIdEqualTo(Long value) {
            addCriterion("m_user_id =", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotEqualTo(Long value) {
            addCriterion("m_user_id <>", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThan(Long value) {
            addCriterion("m_user_id >", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("m_user_id >=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThan(Long value) {
            addCriterion("m_user_id <", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThanOrEqualTo(Long value) {
            addCriterion("m_user_id <=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdIn(List<Long> values) {
            addCriterion("m_user_id in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotIn(List<Long> values) {
            addCriterion("m_user_id not in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdBetween(Long value1, Long value2) {
            addCriterion("m_user_id between", value1, value2, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotBetween(Long value1, Long value2) {
            addCriterion("m_user_id not between", value1, value2, "mUserId");
            return (Criteria) this;
        }

        public Criteria andGgsTimeIsNull() {
            addCriterion("ggs_time is null");
            return (Criteria) this;
        }

        public Criteria andGgsTimeIsNotNull() {
            addCriterion("ggs_time is not null");
            return (Criteria) this;
        }

        public Criteria andGgsTimeEqualTo(Date value) {
            addCriterion("ggs_time =", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeNotEqualTo(Date value) {
            addCriterion("ggs_time <>", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeGreaterThan(Date value) {
            addCriterion("ggs_time >", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ggs_time >=", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeLessThan(Date value) {
            addCriterion("ggs_time <", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeLessThanOrEqualTo(Date value) {
            addCriterion("ggs_time <=", value, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeIn(List<Date> values) {
            addCriterion("ggs_time in", values, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeNotIn(List<Date> values) {
            addCriterion("ggs_time not in", values, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeBetween(Date value1, Date value2) {
            addCriterion("ggs_time between", value1, value2, "ggsTime");
            return (Criteria) this;
        }

        public Criteria andGgsTimeNotBetween(Date value1, Date value2) {
            addCriterion("ggs_time not between", value1, value2, "ggsTime");
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