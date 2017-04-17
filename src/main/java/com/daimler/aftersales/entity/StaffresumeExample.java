package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffresumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffresumeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNull() {
            addCriterion("DealerID is null");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNotNull() {
            addCriterion("DealerID is not null");
            return (Criteria) this;
        }

        public Criteria andDealeridEqualTo(Integer value) {
            addCriterion("DealerID =", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotEqualTo(Integer value) {
            addCriterion("DealerID <>", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThan(Integer value) {
            addCriterion("DealerID >", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DealerID >=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThan(Integer value) {
            addCriterion("DealerID <", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThanOrEqualTo(Integer value) {
            addCriterion("DealerID <=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridIn(List<Integer> values) {
            addCriterion("DealerID in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotIn(List<Integer> values) {
            addCriterion("DealerID not in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridBetween(Integer value1, Integer value2) {
            addCriterion("DealerID between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotBetween(Integer value1, Integer value2) {
            addCriterion("DealerID not between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNull() {
            addCriterion("PositionID is null");
            return (Criteria) this;
        }

        public Criteria andPositionidIsNotNull() {
            addCriterion("PositionID is not null");
            return (Criteria) this;
        }

        public Criteria andPositionidEqualTo(Long value) {
            addCriterion("PositionID =", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotEqualTo(Long value) {
            addCriterion("PositionID <>", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThan(Long value) {
            addCriterion("PositionID >", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidGreaterThanOrEqualTo(Long value) {
            addCriterion("PositionID >=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThan(Long value) {
            addCriterion("PositionID <", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidLessThanOrEqualTo(Long value) {
            addCriterion("PositionID <=", value, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidIn(List<Long> values) {
            addCriterion("PositionID in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotIn(List<Long> values) {
            addCriterion("PositionID not in", values, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidBetween(Long value1, Long value2) {
            addCriterion("PositionID between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andPositionidNotBetween(Long value1, Long value2) {
            addCriterion("PositionID not between", value1, value2, "positionid");
            return (Criteria) this;
        }

        public Criteria andCratedateIsNull() {
            addCriterion("CrateDate is null");
            return (Criteria) this;
        }

        public Criteria andCratedateIsNotNull() {
            addCriterion("CrateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCratedateEqualTo(Date value) {
            addCriterion("CrateDate =", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotEqualTo(Date value) {
            addCriterion("CrateDate <>", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateGreaterThan(Date value) {
            addCriterion("CrateDate >", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CrateDate >=", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateLessThan(Date value) {
            addCriterion("CrateDate <", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateLessThanOrEqualTo(Date value) {
            addCriterion("CrateDate <=", value, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateIn(List<Date> values) {
            addCriterion("CrateDate in", values, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotIn(List<Date> values) {
            addCriterion("CrateDate not in", values, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateBetween(Date value1, Date value2) {
            addCriterion("CrateDate between", value1, value2, "cratedate");
            return (Criteria) this;
        }

        public Criteria andCratedateNotBetween(Date value1, Date value2) {
            addCriterion("CrateDate not between", value1, value2, "cratedate");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNull() {
            addCriterion("PositionName is null");
            return (Criteria) this;
        }

        public Criteria andPositionnameIsNotNull() {
            addCriterion("PositionName is not null");
            return (Criteria) this;
        }

        public Criteria andPositionnameEqualTo(String value) {
            addCriterion("PositionName =", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotEqualTo(String value) {
            addCriterion("PositionName <>", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThan(String value) {
            addCriterion("PositionName >", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameGreaterThanOrEqualTo(String value) {
            addCriterion("PositionName >=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThan(String value) {
            addCriterion("PositionName <", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLessThanOrEqualTo(String value) {
            addCriterion("PositionName <=", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameLike(String value) {
            addCriterion("PositionName like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotLike(String value) {
            addCriterion("PositionName not like", value, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameIn(List<String> values) {
            addCriterion("PositionName in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotIn(List<String> values) {
            addCriterion("PositionName not in", values, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameBetween(String value1, String value2) {
            addCriterion("PositionName between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andPositionnameNotBetween(String value1, String value2) {
            addCriterion("PositionName not between", value1, value2, "positionname");
            return (Criteria) this;
        }

        public Criteria andStatustypeIsNull() {
            addCriterion("StatusType is null");
            return (Criteria) this;
        }

        public Criteria andStatustypeIsNotNull() {
            addCriterion("StatusType is not null");
            return (Criteria) this;
        }

        public Criteria andStatustypeEqualTo(Integer value) {
            addCriterion("StatusType =", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeNotEqualTo(Integer value) {
            addCriterion("StatusType <>", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeGreaterThan(Integer value) {
            addCriterion("StatusType >", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("StatusType >=", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeLessThan(Integer value) {
            addCriterion("StatusType <", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeLessThanOrEqualTo(Integer value) {
            addCriterion("StatusType <=", value, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeIn(List<Integer> values) {
            addCriterion("StatusType in", values, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeNotIn(List<Integer> values) {
            addCriterion("StatusType not in", values, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeBetween(Integer value1, Integer value2) {
            addCriterion("StatusType between", value1, value2, "statustype");
            return (Criteria) this;
        }

        public Criteria andStatustypeNotBetween(Integer value1, Integer value2) {
            addCriterion("StatusType not between", value1, value2, "statustype");
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