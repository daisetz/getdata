package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class DealerformatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerformatExample() {
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

        public Criteria andFormatidIsNull() {
            addCriterion("FormatID is null");
            return (Criteria) this;
        }

        public Criteria andFormatidIsNotNull() {
            addCriterion("FormatID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatidEqualTo(Integer value) {
            addCriterion("FormatID =", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotEqualTo(Integer value) {
            addCriterion("FormatID <>", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThan(Integer value) {
            addCriterion("FormatID >", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormatID >=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThan(Integer value) {
            addCriterion("FormatID <", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidLessThanOrEqualTo(Integer value) {
            addCriterion("FormatID <=", value, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidIn(List<Integer> values) {
            addCriterion("FormatID in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotIn(List<Integer> values) {
            addCriterion("FormatID not in", values, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidBetween(Integer value1, Integer value2) {
            addCriterion("FormatID between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatidNotBetween(Integer value1, Integer value2) {
            addCriterion("FormatID not between", value1, value2, "formatid");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnIsNull() {
            addCriterion("FormatNameCn is null");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnIsNotNull() {
            addCriterion("FormatNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnEqualTo(String value) {
            addCriterion("FormatNameCn =", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnNotEqualTo(String value) {
            addCriterion("FormatNameCn <>", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnGreaterThan(String value) {
            addCriterion("FormatNameCn >", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnGreaterThanOrEqualTo(String value) {
            addCriterion("FormatNameCn >=", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnLessThan(String value) {
            addCriterion("FormatNameCn <", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnLessThanOrEqualTo(String value) {
            addCriterion("FormatNameCn <=", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnLike(String value) {
            addCriterion("FormatNameCn like", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnNotLike(String value) {
            addCriterion("FormatNameCn not like", value, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnIn(List<String> values) {
            addCriterion("FormatNameCn in", values, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnNotIn(List<String> values) {
            addCriterion("FormatNameCn not in", values, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnBetween(String value1, String value2) {
            addCriterion("FormatNameCn between", value1, value2, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnamecnNotBetween(String value1, String value2) {
            addCriterion("FormatNameCn not between", value1, value2, "formatnamecn");
            return (Criteria) this;
        }

        public Criteria andFormatnameenIsNull() {
            addCriterion("FormatNameEn is null");
            return (Criteria) this;
        }

        public Criteria andFormatnameenIsNotNull() {
            addCriterion("FormatNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andFormatnameenEqualTo(String value) {
            addCriterion("FormatNameEn =", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenNotEqualTo(String value) {
            addCriterion("FormatNameEn <>", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenGreaterThan(String value) {
            addCriterion("FormatNameEn >", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenGreaterThanOrEqualTo(String value) {
            addCriterion("FormatNameEn >=", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenLessThan(String value) {
            addCriterion("FormatNameEn <", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenLessThanOrEqualTo(String value) {
            addCriterion("FormatNameEn <=", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenLike(String value) {
            addCriterion("FormatNameEn like", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenNotLike(String value) {
            addCriterion("FormatNameEn not like", value, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenIn(List<String> values) {
            addCriterion("FormatNameEn in", values, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenNotIn(List<String> values) {
            addCriterion("FormatNameEn not in", values, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenBetween(String value1, String value2) {
            addCriterion("FormatNameEn between", value1, value2, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatnameenNotBetween(String value1, String value2) {
            addCriterion("FormatNameEn not between", value1, value2, "formatnameen");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameIsNull() {
            addCriterion("FormatShortName is null");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameIsNotNull() {
            addCriterion("FormatShortName is not null");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameEqualTo(String value) {
            addCriterion("FormatShortName =", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameNotEqualTo(String value) {
            addCriterion("FormatShortName <>", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameGreaterThan(String value) {
            addCriterion("FormatShortName >", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("FormatShortName >=", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameLessThan(String value) {
            addCriterion("FormatShortName <", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameLessThanOrEqualTo(String value) {
            addCriterion("FormatShortName <=", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameLike(String value) {
            addCriterion("FormatShortName like", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameNotLike(String value) {
            addCriterion("FormatShortName not like", value, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameIn(List<String> values) {
            addCriterion("FormatShortName in", values, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameNotIn(List<String> values) {
            addCriterion("FormatShortName not in", values, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameBetween(String value1, String value2) {
            addCriterion("FormatShortName between", value1, value2, "formatshortname");
            return (Criteria) this;
        }

        public Criteria andFormatshortnameNotBetween(String value1, String value2) {
            addCriterion("FormatShortName not between", value1, value2, "formatshortname");
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