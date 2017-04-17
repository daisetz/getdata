package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class RegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegionExample() {
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

        public Criteria andRegionidIsNull() {
            addCriterion("RegionID is null");
            return (Criteria) this;
        }

        public Criteria andRegionidIsNotNull() {
            addCriterion("RegionID is not null");
            return (Criteria) this;
        }

        public Criteria andRegionidEqualTo(Integer value) {
            addCriterion("RegionID =", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotEqualTo(Integer value) {
            addCriterion("RegionID <>", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThan(Integer value) {
            addCriterion("RegionID >", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegionID >=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThan(Integer value) {
            addCriterion("RegionID <", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidLessThanOrEqualTo(Integer value) {
            addCriterion("RegionID <=", value, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidIn(List<Integer> values) {
            addCriterion("RegionID in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotIn(List<Integer> values) {
            addCriterion("RegionID not in", values, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidBetween(Integer value1, Integer value2) {
            addCriterion("RegionID between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionidNotBetween(Integer value1, Integer value2) {
            addCriterion("RegionID not between", value1, value2, "regionid");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnIsNull() {
            addCriterion("RegionNameCn is null");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnIsNotNull() {
            addCriterion("RegionNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnEqualTo(String value) {
            addCriterion("RegionNameCn =", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnNotEqualTo(String value) {
            addCriterion("RegionNameCn <>", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnGreaterThan(String value) {
            addCriterion("RegionNameCn >", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("RegionNameCn >=", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnLessThan(String value) {
            addCriterion("RegionNameCn <", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnLessThanOrEqualTo(String value) {
            addCriterion("RegionNameCn <=", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnLike(String value) {
            addCriterion("RegionNameCn like", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnNotLike(String value) {
            addCriterion("RegionNameCn not like", value, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnIn(List<String> values) {
            addCriterion("RegionNameCn in", values, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnNotIn(List<String> values) {
            addCriterion("RegionNameCn not in", values, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnBetween(String value1, String value2) {
            addCriterion("RegionNameCn between", value1, value2, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnamecnNotBetween(String value1, String value2) {
            addCriterion("RegionNameCn not between", value1, value2, "regionnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionnameenIsNull() {
            addCriterion("RegionNameEn is null");
            return (Criteria) this;
        }

        public Criteria andRegionnameenIsNotNull() {
            addCriterion("RegionNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionnameenEqualTo(String value) {
            addCriterion("RegionNameEn =", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenNotEqualTo(String value) {
            addCriterion("RegionNameEn <>", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenGreaterThan(String value) {
            addCriterion("RegionNameEn >", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenGreaterThanOrEqualTo(String value) {
            addCriterion("RegionNameEn >=", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenLessThan(String value) {
            addCriterion("RegionNameEn <", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenLessThanOrEqualTo(String value) {
            addCriterion("RegionNameEn <=", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenLike(String value) {
            addCriterion("RegionNameEn like", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenNotLike(String value) {
            addCriterion("RegionNameEn not like", value, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenIn(List<String> values) {
            addCriterion("RegionNameEn in", values, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenNotIn(List<String> values) {
            addCriterion("RegionNameEn not in", values, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenBetween(String value1, String value2) {
            addCriterion("RegionNameEn between", value1, value2, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionnameenNotBetween(String value1, String value2) {
            addCriterion("RegionNameEn not between", value1, value2, "regionnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnIsNull() {
            addCriterion("RegionShortNameCn is null");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnIsNotNull() {
            addCriterion("RegionShortNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnEqualTo(String value) {
            addCriterion("RegionShortNameCn =", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnNotEqualTo(String value) {
            addCriterion("RegionShortNameCn <>", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnGreaterThan(String value) {
            addCriterion("RegionShortNameCn >", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("RegionShortNameCn >=", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnLessThan(String value) {
            addCriterion("RegionShortNameCn <", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnLessThanOrEqualTo(String value) {
            addCriterion("RegionShortNameCn <=", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnLike(String value) {
            addCriterion("RegionShortNameCn like", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnNotLike(String value) {
            addCriterion("RegionShortNameCn not like", value, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnIn(List<String> values) {
            addCriterion("RegionShortNameCn in", values, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnNotIn(List<String> values) {
            addCriterion("RegionShortNameCn not in", values, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnBetween(String value1, String value2) {
            addCriterion("RegionShortNameCn between", value1, value2, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnamecnNotBetween(String value1, String value2) {
            addCriterion("RegionShortNameCn not between", value1, value2, "regionshortnamecn");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenIsNull() {
            addCriterion("RegionShortNameEn is null");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenIsNotNull() {
            addCriterion("RegionShortNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenEqualTo(String value) {
            addCriterion("RegionShortNameEn =", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenNotEqualTo(String value) {
            addCriterion("RegionShortNameEn <>", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenGreaterThan(String value) {
            addCriterion("RegionShortNameEn >", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenGreaterThanOrEqualTo(String value) {
            addCriterion("RegionShortNameEn >=", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenLessThan(String value) {
            addCriterion("RegionShortNameEn <", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenLessThanOrEqualTo(String value) {
            addCriterion("RegionShortNameEn <=", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenLike(String value) {
            addCriterion("RegionShortNameEn like", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenNotLike(String value) {
            addCriterion("RegionShortNameEn not like", value, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenIn(List<String> values) {
            addCriterion("RegionShortNameEn in", values, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenNotIn(List<String> values) {
            addCriterion("RegionShortNameEn not in", values, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenBetween(String value1, String value2) {
            addCriterion("RegionShortNameEn between", value1, value2, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andRegionshortnameenNotBetween(String value1, String value2) {
            addCriterion("RegionShortNameEn not between", value1, value2, "regionshortnameen");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidIsNull() {
            addCriterion("MBCLDepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidIsNotNull() {
            addCriterion("MBCLDepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidEqualTo(Integer value) {
            addCriterion("MBCLDepartmentID =", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidNotEqualTo(Integer value) {
            addCriterion("MBCLDepartmentID <>", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidGreaterThan(Integer value) {
            addCriterion("MBCLDepartmentID >", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MBCLDepartmentID >=", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidLessThan(Integer value) {
            addCriterion("MBCLDepartmentID <", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("MBCLDepartmentID <=", value, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidIn(List<Integer> values) {
            addCriterion("MBCLDepartmentID in", values, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidNotIn(List<Integer> values) {
            addCriterion("MBCLDepartmentID not in", values, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("MBCLDepartmentID between", value1, value2, "mbcldepartmentid");
            return (Criteria) this;
        }

        public Criteria andMbcldepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("MBCLDepartmentID not between", value1, value2, "mbcldepartmentid");
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