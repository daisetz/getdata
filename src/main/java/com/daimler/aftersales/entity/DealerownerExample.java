package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class DealerownerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerownerExample() {
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

        public Criteria andDealerowneridIsNull() {
            addCriterion("DealerOwnerID is null");
            return (Criteria) this;
        }

        public Criteria andDealerowneridIsNotNull() {
            addCriterion("DealerOwnerID is not null");
            return (Criteria) this;
        }

        public Criteria andDealerowneridEqualTo(Integer value) {
            addCriterion("DealerOwnerID =", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridNotEqualTo(Integer value) {
            addCriterion("DealerOwnerID <>", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridGreaterThan(Integer value) {
            addCriterion("DealerOwnerID >", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("DealerOwnerID >=", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridLessThan(Integer value) {
            addCriterion("DealerOwnerID <", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridLessThanOrEqualTo(Integer value) {
            addCriterion("DealerOwnerID <=", value, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridIn(List<Integer> values) {
            addCriterion("DealerOwnerID in", values, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridNotIn(List<Integer> values) {
            addCriterion("DealerOwnerID not in", values, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridBetween(Integer value1, Integer value2) {
            addCriterion("DealerOwnerID between", value1, value2, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andDealerowneridNotBetween(Integer value1, Integer value2) {
            addCriterion("DealerOwnerID not between", value1, value2, "dealerownerid");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnIsNull() {
            addCriterion("OwnerNameCn is null");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnIsNotNull() {
            addCriterion("OwnerNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnEqualTo(String value) {
            addCriterion("OwnerNameCn =", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnNotEqualTo(String value) {
            addCriterion("OwnerNameCn <>", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnGreaterThan(String value) {
            addCriterion("OwnerNameCn >", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerNameCn >=", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnLessThan(String value) {
            addCriterion("OwnerNameCn <", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnLessThanOrEqualTo(String value) {
            addCriterion("OwnerNameCn <=", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnLike(String value) {
            addCriterion("OwnerNameCn like", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnNotLike(String value) {
            addCriterion("OwnerNameCn not like", value, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnIn(List<String> values) {
            addCriterion("OwnerNameCn in", values, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnNotIn(List<String> values) {
            addCriterion("OwnerNameCn not in", values, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnBetween(String value1, String value2) {
            addCriterion("OwnerNameCn between", value1, value2, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernamecnNotBetween(String value1, String value2) {
            addCriterion("OwnerNameCn not between", value1, value2, "ownernamecn");
            return (Criteria) this;
        }

        public Criteria andOwnernameenIsNull() {
            addCriterion("OwnerNameEn is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameenIsNotNull() {
            addCriterion("OwnerNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameenEqualTo(String value) {
            addCriterion("OwnerNameEn =", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenNotEqualTo(String value) {
            addCriterion("OwnerNameEn <>", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenGreaterThan(String value) {
            addCriterion("OwnerNameEn >", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerNameEn >=", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenLessThan(String value) {
            addCriterion("OwnerNameEn <", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenLessThanOrEqualTo(String value) {
            addCriterion("OwnerNameEn <=", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenLike(String value) {
            addCriterion("OwnerNameEn like", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenNotLike(String value) {
            addCriterion("OwnerNameEn not like", value, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenIn(List<String> values) {
            addCriterion("OwnerNameEn in", values, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenNotIn(List<String> values) {
            addCriterion("OwnerNameEn not in", values, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenBetween(String value1, String value2) {
            addCriterion("OwnerNameEn between", value1, value2, "ownernameen");
            return (Criteria) this;
        }

        public Criteria andOwnernameenNotBetween(String value1, String value2) {
            addCriterion("OwnerNameEn not between", value1, value2, "ownernameen");
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