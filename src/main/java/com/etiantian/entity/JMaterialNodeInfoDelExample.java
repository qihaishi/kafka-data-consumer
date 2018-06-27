package com.etiantian.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JMaterialNodeInfoDelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JMaterialNodeInfoDelExample() {
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

        public Criteria andListIdIsNull() {
            addCriterion("list_id is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("list_id is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(Long value) {
            addCriterion("list_id =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(Long value) {
            addCriterion("list_id <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(Long value) {
            addCriterion("list_id >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(Long value) {
            addCriterion("list_id >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(Long value) {
            addCriterion("list_id <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(Long value) {
            addCriterion("list_id <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<Long> values) {
            addCriterion("list_id in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<Long> values) {
            addCriterion("list_id not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(Long value1, Long value2) {
            addCriterion("list_id between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(Long value1, Long value2) {
            addCriterion("list_id not between", value1, value2, "listId");
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

        public Criteria andListDirNameIsNull() {
            addCriterion("list_dir_name is null");
            return (Criteria) this;
        }

        public Criteria andListDirNameIsNotNull() {
            addCriterion("list_dir_name is not null");
            return (Criteria) this;
        }

        public Criteria andListDirNameEqualTo(String value) {
            addCriterion("list_dir_name =", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameNotEqualTo(String value) {
            addCriterion("list_dir_name <>", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameGreaterThan(String value) {
            addCriterion("list_dir_name >", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameGreaterThanOrEqualTo(String value) {
            addCriterion("list_dir_name >=", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameLessThan(String value) {
            addCriterion("list_dir_name <", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameLessThanOrEqualTo(String value) {
            addCriterion("list_dir_name <=", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameLike(String value) {
            addCriterion("list_dir_name like", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameNotLike(String value) {
            addCriterion("list_dir_name not like", value, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameIn(List<String> values) {
            addCriterion("list_dir_name in", values, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameNotIn(List<String> values) {
            addCriterion("list_dir_name not in", values, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameBetween(String value1, String value2) {
            addCriterion("list_dir_name between", value1, value2, "listDirName");
            return (Criteria) this;
        }

        public Criteria andListDirNameNotBetween(String value1, String value2) {
            addCriterion("list_dir_name not between", value1, value2, "listDirName");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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