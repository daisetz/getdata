package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class ProvinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvinceExample() {
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

        public Criteria andProvinceidIsNull() {
            addCriterion("ProvinceID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("ProvinceID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("ProvinceID =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("ProvinceID <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("ProvinceID >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProvinceID >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("ProvinceID <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("ProvinceID <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("ProvinceID in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("ProvinceID not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceID between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProvinceID not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnIsNull() {
            addCriterion("ProvinceNameCn is null");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnIsNotNull() {
            addCriterion("ProvinceNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnEqualTo(String value) {
            addCriterion("ProvinceNameCn =", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnNotEqualTo(String value) {
            addCriterion("ProvinceNameCn <>", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnGreaterThan(String value) {
            addCriterion("ProvinceNameCn >", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceNameCn >=", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnLessThan(String value) {
            addCriterion("ProvinceNameCn <", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnLessThanOrEqualTo(String value) {
            addCriterion("ProvinceNameCn <=", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnLike(String value) {
            addCriterion("ProvinceNameCn like", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnNotLike(String value) {
            addCriterion("ProvinceNameCn not like", value, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnIn(List<String> values) {
            addCriterion("ProvinceNameCn in", values, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnNotIn(List<String> values) {
            addCriterion("ProvinceNameCn not in", values, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnBetween(String value1, String value2) {
            addCriterion("ProvinceNameCn between", value1, value2, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenamecnNotBetween(String value1, String value2) {
            addCriterion("ProvinceNameCn not between", value1, value2, "provincenamecn");
            return (Criteria) this;
        }

        public Criteria andProvincenameenIsNull() {
            addCriterion("ProvinceNameEn is null");
            return (Criteria) this;
        }

        public Criteria andProvincenameenIsNotNull() {
            addCriterion("ProvinceNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenameenEqualTo(String value) {
            addCriterion("ProvinceNameEn =", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenNotEqualTo(String value) {
            addCriterion("ProvinceNameEn <>", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenGreaterThan(String value) {
            addCriterion("ProvinceNameEn >", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceNameEn >=", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenLessThan(String value) {
            addCriterion("ProvinceNameEn <", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenLessThanOrEqualTo(String value) {
            addCriterion("ProvinceNameEn <=", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenLike(String value) {
            addCriterion("ProvinceNameEn like", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenNotLike(String value) {
            addCriterion("ProvinceNameEn not like", value, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenIn(List<String> values) {
            addCriterion("ProvinceNameEn in", values, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenNotIn(List<String> values) {
            addCriterion("ProvinceNameEn not in", values, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenBetween(String value1, String value2) {
            addCriterion("ProvinceNameEn between", value1, value2, "provincenameen");
            return (Criteria) this;
        }

        public Criteria andProvincenameenNotBetween(String value1, String value2) {
            addCriterion("ProvinceNameEn not between", value1, value2, "provincenameen");
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

        public Criteria andProvinceshortnamecnIsNull() {
            addCriterion("ProvinceShortNameCn is null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnIsNotNull() {
            addCriterion("ProvinceShortNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnEqualTo(String value) {
            addCriterion("ProvinceShortNameCn =", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnNotEqualTo(String value) {
            addCriterion("ProvinceShortNameCn <>", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnGreaterThan(String value) {
            addCriterion("ProvinceShortNameCn >", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceShortNameCn >=", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnLessThan(String value) {
            addCriterion("ProvinceShortNameCn <", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnLessThanOrEqualTo(String value) {
            addCriterion("ProvinceShortNameCn <=", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnLike(String value) {
            addCriterion("ProvinceShortNameCn like", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnNotLike(String value) {
            addCriterion("ProvinceShortNameCn not like", value, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnIn(List<String> values) {
            addCriterion("ProvinceShortNameCn in", values, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnNotIn(List<String> values) {
            addCriterion("ProvinceShortNameCn not in", values, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnBetween(String value1, String value2) {
            addCriterion("ProvinceShortNameCn between", value1, value2, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnamecnNotBetween(String value1, String value2) {
            addCriterion("ProvinceShortNameCn not between", value1, value2, "provinceshortnamecn");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenIsNull() {
            addCriterion("ProvinceShortNameEn is null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenIsNotNull() {
            addCriterion("ProvinceShortNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenEqualTo(String value) {
            addCriterion("ProvinceShortNameEn =", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenNotEqualTo(String value) {
            addCriterion("ProvinceShortNameEn <>", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenGreaterThan(String value) {
            addCriterion("ProvinceShortNameEn >", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenGreaterThanOrEqualTo(String value) {
            addCriterion("ProvinceShortNameEn >=", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenLessThan(String value) {
            addCriterion("ProvinceShortNameEn <", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenLessThanOrEqualTo(String value) {
            addCriterion("ProvinceShortNameEn <=", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenLike(String value) {
            addCriterion("ProvinceShortNameEn like", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenNotLike(String value) {
            addCriterion("ProvinceShortNameEn not like", value, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenIn(List<String> values) {
            addCriterion("ProvinceShortNameEn in", values, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenNotIn(List<String> values) {
            addCriterion("ProvinceShortNameEn not in", values, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenBetween(String value1, String value2) {
            addCriterion("ProvinceShortNameEn between", value1, value2, "provinceshortnameen");
            return (Criteria) this;
        }

        public Criteria andProvinceshortnameenNotBetween(String value1, String value2) {
            addCriterion("ProvinceShortNameEn not between", value1, value2, "provinceshortnameen");
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