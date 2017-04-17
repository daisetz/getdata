package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealeraccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealeraccountExample() {
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

        public Criteria andDealeraccountidIsNull() {
            addCriterion("DealerAccountID is null");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidIsNotNull() {
            addCriterion("DealerAccountID is not null");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidEqualTo(Integer value) {
            addCriterion("DealerAccountID =", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidNotEqualTo(Integer value) {
            addCriterion("DealerAccountID <>", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidGreaterThan(Integer value) {
            addCriterion("DealerAccountID >", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DealerAccountID >=", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidLessThan(Integer value) {
            addCriterion("DealerAccountID <", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidLessThanOrEqualTo(Integer value) {
            addCriterion("DealerAccountID <=", value, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidIn(List<Integer> values) {
            addCriterion("DealerAccountID in", values, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidNotIn(List<Integer> values) {
            addCriterion("DealerAccountID not in", values, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidBetween(Integer value1, Integer value2) {
            addCriterion("DealerAccountID between", value1, value2, "dealeraccountid");
            return (Criteria) this;
        }

        public Criteria andDealeraccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("DealerAccountID not between", value1, value2, "dealeraccountid");
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

        public Criteria andPositiontypeidIsNull() {
            addCriterion("PositionTypeID is null");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidIsNotNull() {
            addCriterion("PositionTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidEqualTo(Integer value) {
            addCriterion("PositionTypeID =", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidNotEqualTo(Integer value) {
            addCriterion("PositionTypeID <>", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidGreaterThan(Integer value) {
            addCriterion("PositionTypeID >", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PositionTypeID >=", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidLessThan(Integer value) {
            addCriterion("PositionTypeID <", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidLessThanOrEqualTo(Integer value) {
            addCriterion("PositionTypeID <=", value, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidIn(List<Integer> values) {
            addCriterion("PositionTypeID in", values, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidNotIn(List<Integer> values) {
            addCriterion("PositionTypeID not in", values, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidBetween(Integer value1, Integer value2) {
            addCriterion("PositionTypeID between", value1, value2, "positiontypeid");
            return (Criteria) this;
        }

        public Criteria andPositiontypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("PositionTypeID not between", value1, value2, "positiontypeid");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Long value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Long value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Long value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Long value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Long value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Long value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Long> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Long> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Long value1, Long value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Long value1, Long value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNull() {
            addCriterion("Division is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNotNull() {
            addCriterion("Division is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionEqualTo(String value) {
            addCriterion("Division =", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotEqualTo(String value) {
            addCriterion("Division <>", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThan(String value) {
            addCriterion("Division >", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("Division >=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThan(String value) {
            addCriterion("Division <", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThanOrEqualTo(String value) {
            addCriterion("Division <=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLike(String value) {
            addCriterion("Division like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotLike(String value) {
            addCriterion("Division not like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionIn(List<String> values) {
            addCriterion("Division in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotIn(List<String> values) {
            addCriterion("Division not in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionBetween(String value1, String value2) {
            addCriterion("Division between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotBetween(String value1, String value2) {
            addCriterion("Division not between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNull() {
            addCriterion("ChangeStatus is null");
            return (Criteria) this;
        }

        public Criteria andChangestatusIsNotNull() {
            addCriterion("ChangeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andChangestatusEqualTo(Integer value) {
            addCriterion("ChangeStatus =", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotEqualTo(Integer value) {
            addCriterion("ChangeStatus <>", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThan(Integer value) {
            addCriterion("ChangeStatus >", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ChangeStatus >=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThan(Integer value) {
            addCriterion("ChangeStatus <", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusLessThanOrEqualTo(Integer value) {
            addCriterion("ChangeStatus <=", value, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusIn(List<Integer> values) {
            addCriterion("ChangeStatus in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotIn(List<Integer> values) {
            addCriterion("ChangeStatus not in", values, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusBetween(Integer value1, Integer value2) {
            addCriterion("ChangeStatus between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andChangestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ChangeStatus not between", value1, value2, "changestatus");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("ZipCode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("ZipCode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("ZipCode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("ZipCode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("ZipCode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZipCode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("ZipCode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ZipCode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("ZipCode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("ZipCode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("ZipCode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("ZipCode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("ZipCode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("ZipCode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UpdateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("ApplyStatus is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("ApplyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(Integer value) {
            addCriterion("ApplyStatus =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(Integer value) {
            addCriterion("ApplyStatus <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(Integer value) {
            addCriterion("ApplyStatus >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApplyStatus >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(Integer value) {
            addCriterion("ApplyStatus <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(Integer value) {
            addCriterion("ApplyStatus <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<Integer> values) {
            addCriterion("ApplyStatus in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<Integer> values) {
            addCriterion("ApplyStatus not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(Integer value1, Integer value2) {
            addCriterion("ApplyStatus between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ApplyStatus not between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andProxyperiodIsNull() {
            addCriterion("ProxyPeriod is null");
            return (Criteria) this;
        }

        public Criteria andProxyperiodIsNotNull() {
            addCriterion("ProxyPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andProxyperiodEqualTo(Date value) {
            addCriterion("ProxyPeriod =", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodNotEqualTo(Date value) {
            addCriterion("ProxyPeriod <>", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodGreaterThan(Date value) {
            addCriterion("ProxyPeriod >", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodGreaterThanOrEqualTo(Date value) {
            addCriterion("ProxyPeriod >=", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodLessThan(Date value) {
            addCriterion("ProxyPeriod <", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodLessThanOrEqualTo(Date value) {
            addCriterion("ProxyPeriod <=", value, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodIn(List<Date> values) {
            addCriterion("ProxyPeriod in", values, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodNotIn(List<Date> values) {
            addCriterion("ProxyPeriod not in", values, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodBetween(Date value1, Date value2) {
            addCriterion("ProxyPeriod between", value1, value2, "proxyperiod");
            return (Criteria) this;
        }

        public Criteria andProxyperiodNotBetween(Date value1, Date value2) {
            addCriterion("ProxyPeriod not between", value1, value2, "proxyperiod");
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