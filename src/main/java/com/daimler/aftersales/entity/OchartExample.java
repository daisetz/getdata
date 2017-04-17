package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.List;

public class OchartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OchartExample() {
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

        public Criteria andOchartidIsNull() {
            addCriterion("OChartID is null");
            return (Criteria) this;
        }

        public Criteria andOchartidIsNotNull() {
            addCriterion("OChartID is not null");
            return (Criteria) this;
        }

        public Criteria andOchartidEqualTo(Long value) {
            addCriterion("OChartID =", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidNotEqualTo(Long value) {
            addCriterion("OChartID <>", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidGreaterThan(Long value) {
            addCriterion("OChartID >", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidGreaterThanOrEqualTo(Long value) {
            addCriterion("OChartID >=", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidLessThan(Long value) {
            addCriterion("OChartID <", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidLessThanOrEqualTo(Long value) {
            addCriterion("OChartID <=", value, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidIn(List<Long> values) {
            addCriterion("OChartID in", values, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidNotIn(List<Long> values) {
            addCriterion("OChartID not in", values, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidBetween(Long value1, Long value2) {
            addCriterion("OChartID between", value1, value2, "ochartid");
            return (Criteria) this;
        }

        public Criteria andOchartidNotBetween(Long value1, Long value2) {
            addCriterion("OChartID not between", value1, value2, "ochartid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("CompanyID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("CompanyID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("CompanyID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CompanyID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("CompanyID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("CompanyID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("CompanyID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("CompanyID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID not between", value1, value2, "companyid");
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

        public Criteria andParentidIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Long value) {
            addCriterion("ParentID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Long value) {
            addCriterion("ParentID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Long value) {
            addCriterion("ParentID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Long value) {
            addCriterion("ParentID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Long value) {
            addCriterion("ParentID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Long value) {
            addCriterion("ParentID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Long> values) {
            addCriterion("ParentID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Long> values) {
            addCriterion("ParentID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Long value1, Long value2) {
            addCriterion("ParentID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Long value1, Long value2) {
            addCriterion("ParentID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNull() {
            addCriterion("NameCn is null");
            return (Criteria) this;
        }

        public Criteria andNamecnIsNotNull() {
            addCriterion("NameCn is not null");
            return (Criteria) this;
        }

        public Criteria andNamecnEqualTo(String value) {
            addCriterion("NameCn =", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotEqualTo(String value) {
            addCriterion("NameCn <>", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThan(String value) {
            addCriterion("NameCn >", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnGreaterThanOrEqualTo(String value) {
            addCriterion("NameCn >=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThan(String value) {
            addCriterion("NameCn <", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLessThanOrEqualTo(String value) {
            addCriterion("NameCn <=", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnLike(String value) {
            addCriterion("NameCn like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotLike(String value) {
            addCriterion("NameCn not like", value, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnIn(List<String> values) {
            addCriterion("NameCn in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotIn(List<String> values) {
            addCriterion("NameCn not in", values, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnBetween(String value1, String value2) {
            addCriterion("NameCn between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andNamecnNotBetween(String value1, String value2) {
            addCriterion("NameCn not between", value1, value2, "namecn");
            return (Criteria) this;
        }

        public Criteria andNameenIsNull() {
            addCriterion("NameEn is null");
            return (Criteria) this;
        }

        public Criteria andNameenIsNotNull() {
            addCriterion("NameEn is not null");
            return (Criteria) this;
        }

        public Criteria andNameenEqualTo(String value) {
            addCriterion("NameEn =", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotEqualTo(String value) {
            addCriterion("NameEn <>", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenGreaterThan(String value) {
            addCriterion("NameEn >", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenGreaterThanOrEqualTo(String value) {
            addCriterion("NameEn >=", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLessThan(String value) {
            addCriterion("NameEn <", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLessThanOrEqualTo(String value) {
            addCriterion("NameEn <=", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenLike(String value) {
            addCriterion("NameEn like", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotLike(String value) {
            addCriterion("NameEn not like", value, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenIn(List<String> values) {
            addCriterion("NameEn in", values, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotIn(List<String> values) {
            addCriterion("NameEn not in", values, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenBetween(String value1, String value2) {
            addCriterion("NameEn between", value1, value2, "nameen");
            return (Criteria) this;
        }

        public Criteria andNameenNotBetween(String value1, String value2) {
            addCriterion("NameEn not between", value1, value2, "nameen");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnIsNull() {
            addCriterion("DescriptionCn is null");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnIsNotNull() {
            addCriterion("DescriptionCn is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnEqualTo(String value) {
            addCriterion("DescriptionCn =", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnNotEqualTo(String value) {
            addCriterion("DescriptionCn <>", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnGreaterThan(String value) {
            addCriterion("DescriptionCn >", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnGreaterThanOrEqualTo(String value) {
            addCriterion("DescriptionCn >=", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnLessThan(String value) {
            addCriterion("DescriptionCn <", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnLessThanOrEqualTo(String value) {
            addCriterion("DescriptionCn <=", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnLike(String value) {
            addCriterion("DescriptionCn like", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnNotLike(String value) {
            addCriterion("DescriptionCn not like", value, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnIn(List<String> values) {
            addCriterion("DescriptionCn in", values, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnNotIn(List<String> values) {
            addCriterion("DescriptionCn not in", values, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnBetween(String value1, String value2) {
            addCriterion("DescriptionCn between", value1, value2, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptioncnNotBetween(String value1, String value2) {
            addCriterion("DescriptionCn not between", value1, value2, "descriptioncn");
            return (Criteria) this;
        }

        public Criteria andDescriptionenIsNull() {
            addCriterion("DescriptionEn is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionenIsNotNull() {
            addCriterion("DescriptionEn is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionenEqualTo(String value) {
            addCriterion("DescriptionEn =", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenNotEqualTo(String value) {
            addCriterion("DescriptionEn <>", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenGreaterThan(String value) {
            addCriterion("DescriptionEn >", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenGreaterThanOrEqualTo(String value) {
            addCriterion("DescriptionEn >=", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenLessThan(String value) {
            addCriterion("DescriptionEn <", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenLessThanOrEqualTo(String value) {
            addCriterion("DescriptionEn <=", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenLike(String value) {
            addCriterion("DescriptionEn like", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenNotLike(String value) {
            addCriterion("DescriptionEn not like", value, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenIn(List<String> values) {
            addCriterion("DescriptionEn in", values, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenNotIn(List<String> values) {
            addCriterion("DescriptionEn not in", values, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenBetween(String value1, String value2) {
            addCriterion("DescriptionEn between", value1, value2, "descriptionen");
            return (Criteria) this;
        }

        public Criteria andDescriptionenNotBetween(String value1, String value2) {
            addCriterion("DescriptionEn not between", value1, value2, "descriptionen");
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