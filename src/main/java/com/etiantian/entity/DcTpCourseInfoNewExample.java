package com.etiantian.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DcTpCourseInfoNewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DcTpCourseInfoNewExample() {
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Long value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Long value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Long value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Long value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Long> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Long> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Long value1, Long value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andResPkgIdIsNull() {
            addCriterion("res_pkg_id is null");
            return (Criteria) this;
        }

        public Criteria andResPkgIdIsNotNull() {
            addCriterion("res_pkg_id is not null");
            return (Criteria) this;
        }

        public Criteria andResPkgIdEqualTo(Long value) {
            addCriterion("res_pkg_id =", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdNotEqualTo(Long value) {
            addCriterion("res_pkg_id <>", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdGreaterThan(Long value) {
            addCriterion("res_pkg_id >", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("res_pkg_id >=", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdLessThan(Long value) {
            addCriterion("res_pkg_id <", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdLessThanOrEqualTo(Long value) {
            addCriterion("res_pkg_id <=", value, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdIn(List<Long> values) {
            addCriterion("res_pkg_id in", values, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdNotIn(List<Long> values) {
            addCriterion("res_pkg_id not in", values, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdBetween(Long value1, Long value2) {
            addCriterion("res_pkg_id between", value1, value2, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andResPkgIdNotBetween(Long value1, Long value2) {
            addCriterion("res_pkg_id not between", value1, value2, "resPkgId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNull() {
            addCriterion("root_id is null");
            return (Criteria) this;
        }

        public Criteria andRootIdIsNotNull() {
            addCriterion("root_id is not null");
            return (Criteria) this;
        }

        public Criteria andRootIdEqualTo(Long value) {
            addCriterion("root_id =", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotEqualTo(Long value) {
            addCriterion("root_id <>", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThan(Long value) {
            addCriterion("root_id >", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdGreaterThanOrEqualTo(Long value) {
            addCriterion("root_id >=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThan(Long value) {
            addCriterion("root_id <", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdLessThanOrEqualTo(Long value) {
            addCriterion("root_id <=", value, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdIn(List<Long> values) {
            addCriterion("root_id in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotIn(List<Long> values) {
            addCriterion("root_id not in", values, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdBetween(Long value1, Long value2) {
            addCriterion("root_id between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRootIdNotBetween(Long value1, Long value2) {
            addCriterion("root_id not between", value1, value2, "rootId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(String value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(String value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(String value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(String value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(String value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(String value) {
            addCriterion("route_id like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(String value) {
            addCriterion("route_id not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<String> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<String> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(String value1, String value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(String value1, String value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNull() {
            addCriterion("route_name is null");
            return (Criteria) this;
        }

        public Criteria andRouteNameIsNotNull() {
            addCriterion("route_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNameEqualTo(String value) {
            addCriterion("route_name =", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotEqualTo(String value) {
            addCriterion("route_name <>", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThan(String value) {
            addCriterion("route_name >", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameGreaterThanOrEqualTo(String value) {
            addCriterion("route_name >=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThan(String value) {
            addCriterion("route_name <", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLessThanOrEqualTo(String value) {
            addCriterion("route_name <=", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameLike(String value) {
            addCriterion("route_name like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotLike(String value) {
            addCriterion("route_name not like", value, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameIn(List<String> values) {
            addCriterion("route_name in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotIn(List<String> values) {
            addCriterion("route_name not in", values, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameBetween(String value1, String value2) {
            addCriterion("route_name between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andRouteNameNotBetween(String value1, String value2) {
            addCriterion("route_name not between", value1, value2, "routeName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCUserIdEqualTo(Integer value) {
            addCriterion("c_user_id =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(Integer value) {
            addCriterion("c_user_id <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(Integer value) {
            addCriterion("c_user_id >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_user_id >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(Integer value) {
            addCriterion("c_user_id <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_user_id <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<Integer> values) {
            addCriterion("c_user_id in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<Integer> values) {
            addCriterion("c_user_id not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_user_id not between", value1, value2, "cUserId");
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

        public Criteria andMUserIdIsNull() {
            addCriterion("m_user_id is null");
            return (Criteria) this;
        }

        public Criteria andMUserIdIsNotNull() {
            addCriterion("m_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andMUserIdEqualTo(Integer value) {
            addCriterion("m_user_id =", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotEqualTo(Integer value) {
            addCriterion("m_user_id <>", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThan(Integer value) {
            addCriterion("m_user_id >", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_user_id >=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThan(Integer value) {
            addCriterion("m_user_id <", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_user_id <=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdIn(List<Integer> values) {
            addCriterion("m_user_id in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotIn(List<Integer> values) {
            addCriterion("m_user_id not in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdBetween(Integer value1, Integer value2) {
            addCriterion("m_user_id between", value1, value2, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotBetween(Integer value1, Integer value2) {
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