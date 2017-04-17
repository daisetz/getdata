package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class DealerformatcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerformatcodeExample() {
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

        public Criteria andFormatcodeidIsNull() {
            addCriterion("FormatCodeID is null");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidIsNotNull() {
            addCriterion("FormatCodeID is not null");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidEqualTo(Integer value) {
            addCriterion("FormatCodeID =", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidNotEqualTo(Integer value) {
            addCriterion("FormatCodeID <>", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidGreaterThan(Integer value) {
            addCriterion("FormatCodeID >", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormatCodeID >=", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidLessThan(Integer value) {
            addCriterion("FormatCodeID <", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidLessThanOrEqualTo(Integer value) {
            addCriterion("FormatCodeID <=", value, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidIn(List<Integer> values) {
            addCriterion("FormatCodeID in", values, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidNotIn(List<Integer> values) {
            addCriterion("FormatCodeID not in", values, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidBetween(Integer value1, Integer value2) {
            addCriterion("FormatCodeID between", value1, value2, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("FormatCodeID not between", value1, value2, "formatcodeid");
            return (Criteria) this;
        }

        public Criteria andFormatcodeIsNull() {
            addCriterion("FormatCode is null");
            return (Criteria) this;
        }

        public Criteria andFormatcodeIsNotNull() {
            addCriterion("FormatCode is not null");
            return (Criteria) this;
        }

        public Criteria andFormatcodeEqualTo(String value) {
            addCriterion("FormatCode =", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeNotEqualTo(String value) {
            addCriterion("FormatCode <>", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeGreaterThan(String value) {
            addCriterion("FormatCode >", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FormatCode >=", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeLessThan(String value) {
            addCriterion("FormatCode <", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeLessThanOrEqualTo(String value) {
            addCriterion("FormatCode <=", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeLike(String value) {
            addCriterion("FormatCode like", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeNotLike(String value) {
            addCriterion("FormatCode not like", value, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeIn(List<String> values) {
            addCriterion("FormatCode in", values, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeNotIn(List<String> values) {
            addCriterion("FormatCode not in", values, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeBetween(String value1, String value2) {
            addCriterion("FormatCode between", value1, value2, "formatcode");
            return (Criteria) this;
        }

        public Criteria andFormatcodeNotBetween(String value1, String value2) {
            addCriterion("FormatCode not between", value1, value2, "formatcode");
            return (Criteria) this;
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

        public Criteria andFormatlevelIsNull() {
            addCriterion("FormatLevel is null");
            return (Criteria) this;
        }

        public Criteria andFormatlevelIsNotNull() {
            addCriterion("FormatLevel is not null");
            return (Criteria) this;
        }

        public Criteria andFormatlevelEqualTo(Integer value) {
            addCriterion("FormatLevel =", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelNotEqualTo(Integer value) {
            addCriterion("FormatLevel <>", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelGreaterThan(Integer value) {
            addCriterion("FormatLevel >", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormatLevel >=", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelLessThan(Integer value) {
            addCriterion("FormatLevel <", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelLessThanOrEqualTo(Integer value) {
            addCriterion("FormatLevel <=", value, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelIn(List<Integer> values) {
            addCriterion("FormatLevel in", values, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelNotIn(List<Integer> values) {
            addCriterion("FormatLevel not in", values, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelBetween(Integer value1, Integer value2) {
            addCriterion("FormatLevel between", value1, value2, "formatlevel");
            return (Criteria) this;
        }

        public Criteria andFormatlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("FormatLevel not between", value1, value2, "formatlevel");
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