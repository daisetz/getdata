package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class QualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QualificationExample() {
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

        public Criteria andQualificationidIsNull() {
            addCriterion("QualificationID is null");
            return (Criteria) this;
        }

        public Criteria andQualificationidIsNotNull() {
            addCriterion("QualificationID is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationidEqualTo(Integer value) {
            addCriterion("QualificationID =", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotEqualTo(Integer value) {
            addCriterion("QualificationID <>", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidGreaterThan(Integer value) {
            addCriterion("QualificationID >", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("QualificationID >=", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidLessThan(Integer value) {
            addCriterion("QualificationID <", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidLessThanOrEqualTo(Integer value) {
            addCriterion("QualificationID <=", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidIn(List<Integer> values) {
            addCriterion("QualificationID in", values, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotIn(List<Integer> values) {
            addCriterion("QualificationID not in", values, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidBetween(Integer value1, Integer value2) {
            addCriterion("QualificationID between", value1, value2, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("QualificationID not between", value1, value2, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationcnIsNull() {
            addCriterion("QualificationCn is null");
            return (Criteria) this;
        }

        public Criteria andQualificationcnIsNotNull() {
            addCriterion("QualificationCn is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationcnEqualTo(String value) {
            addCriterion("QualificationCn =", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnNotEqualTo(String value) {
            addCriterion("QualificationCn <>", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnGreaterThan(String value) {
            addCriterion("QualificationCn >", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnGreaterThanOrEqualTo(String value) {
            addCriterion("QualificationCn >=", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnLessThan(String value) {
            addCriterion("QualificationCn <", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnLessThanOrEqualTo(String value) {
            addCriterion("QualificationCn <=", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnLike(String value) {
            addCriterion("QualificationCn like", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnNotLike(String value) {
            addCriterion("QualificationCn not like", value, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnIn(List<String> values) {
            addCriterion("QualificationCn in", values, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnNotIn(List<String> values) {
            addCriterion("QualificationCn not in", values, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnBetween(String value1, String value2) {
            addCriterion("QualificationCn between", value1, value2, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationcnNotBetween(String value1, String value2) {
            addCriterion("QualificationCn not between", value1, value2, "qualificationcn");
            return (Criteria) this;
        }

        public Criteria andQualificationenIsNull() {
            addCriterion("QualificationEn is null");
            return (Criteria) this;
        }

        public Criteria andQualificationenIsNotNull() {
            addCriterion("QualificationEn is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationenEqualTo(String value) {
            addCriterion("QualificationEn =", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenNotEqualTo(String value) {
            addCriterion("QualificationEn <>", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenGreaterThan(String value) {
            addCriterion("QualificationEn >", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenGreaterThanOrEqualTo(String value) {
            addCriterion("QualificationEn >=", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenLessThan(String value) {
            addCriterion("QualificationEn <", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenLessThanOrEqualTo(String value) {
            addCriterion("QualificationEn <=", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenLike(String value) {
            addCriterion("QualificationEn like", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenNotLike(String value) {
            addCriterion("QualificationEn not like", value, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenIn(List<String> values) {
            addCriterion("QualificationEn in", values, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenNotIn(List<String> values) {
            addCriterion("QualificationEn not in", values, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenBetween(String value1, String value2) {
            addCriterion("QualificationEn between", value1, value2, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andQualificationenNotBetween(String value1, String value2) {
            addCriterion("QualificationEn not between", value1, value2, "qualificationen");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort not between", value1, value2, "sort");
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