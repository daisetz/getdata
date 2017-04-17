package com.daimler.aftersales.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andCardtypeIsNull() {
            addCriterion("CardType is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(Integer value) {
            addCriterion("CardType =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(Integer value) {
            addCriterion("CardType <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(Integer value) {
            addCriterion("CardType >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CardType >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(Integer value) {
            addCriterion("CardType <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(Integer value) {
            addCriterion("CardType <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<Integer> values) {
            addCriterion("CardType in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<Integer> values) {
            addCriterion("CardType not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(Integer value1, Integer value2) {
            addCriterion("CardType between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CardType not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseIsNull() {
            addCriterion("DrivingLicense is null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseIsNotNull() {
            addCriterion("DrivingLicense is not null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseEqualTo(String value) {
            addCriterion("DrivingLicense =", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseNotEqualTo(String value) {
            addCriterion("DrivingLicense <>", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseGreaterThan(String value) {
            addCriterion("DrivingLicense >", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseGreaterThanOrEqualTo(String value) {
            addCriterion("DrivingLicense >=", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseLessThan(String value) {
            addCriterion("DrivingLicense <", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseLessThanOrEqualTo(String value) {
            addCriterion("DrivingLicense <=", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseLike(String value) {
            addCriterion("DrivingLicense like", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseNotLike(String value) {
            addCriterion("DrivingLicense not like", value, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseIn(List<String> values) {
            addCriterion("DrivingLicense in", values, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseNotIn(List<String> values) {
            addCriterion("DrivingLicense not in", values, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseBetween(String value1, String value2) {
            addCriterion("DrivingLicense between", value1, value2, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andDrivinglicenseNotBetween(String value1, String value2) {
            addCriterion("DrivingLicense not between", value1, value2, "drivinglicense");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnIsNull() {
            addCriterion("FamilyNameCn is null");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnIsNotNull() {
            addCriterion("FamilyNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnEqualTo(String value) {
            addCriterion("FamilyNameCn =", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnNotEqualTo(String value) {
            addCriterion("FamilyNameCn <>", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnGreaterThan(String value) {
            addCriterion("FamilyNameCn >", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyNameCn >=", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnLessThan(String value) {
            addCriterion("FamilyNameCn <", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnLessThanOrEqualTo(String value) {
            addCriterion("FamilyNameCn <=", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnLike(String value) {
            addCriterion("FamilyNameCn like", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnNotLike(String value) {
            addCriterion("FamilyNameCn not like", value, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnIn(List<String> values) {
            addCriterion("FamilyNameCn in", values, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnNotIn(List<String> values) {
            addCriterion("FamilyNameCn not in", values, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnBetween(String value1, String value2) {
            addCriterion("FamilyNameCn between", value1, value2, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynamecnNotBetween(String value1, String value2) {
            addCriterion("FamilyNameCn not between", value1, value2, "familynamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnIsNull() {
            addCriterion("GivenNameCn is null");
            return (Criteria) this;
        }

        public Criteria andGivennamecnIsNotNull() {
            addCriterion("GivenNameCn is not null");
            return (Criteria) this;
        }

        public Criteria andGivennamecnEqualTo(String value) {
            addCriterion("GivenNameCn =", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnNotEqualTo(String value) {
            addCriterion("GivenNameCn <>", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnGreaterThan(String value) {
            addCriterion("GivenNameCn >", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnGreaterThanOrEqualTo(String value) {
            addCriterion("GivenNameCn >=", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnLessThan(String value) {
            addCriterion("GivenNameCn <", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnLessThanOrEqualTo(String value) {
            addCriterion("GivenNameCn <=", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnLike(String value) {
            addCriterion("GivenNameCn like", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnNotLike(String value) {
            addCriterion("GivenNameCn not like", value, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnIn(List<String> values) {
            addCriterion("GivenNameCn in", values, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnNotIn(List<String> values) {
            addCriterion("GivenNameCn not in", values, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnBetween(String value1, String value2) {
            addCriterion("GivenNameCn between", value1, value2, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andGivennamecnNotBetween(String value1, String value2) {
            addCriterion("GivenNameCn not between", value1, value2, "givennamecn");
            return (Criteria) this;
        }

        public Criteria andFamilynameenIsNull() {
            addCriterion("FamilyNameEn is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameenIsNotNull() {
            addCriterion("FamilyNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameenEqualTo(String value) {
            addCriterion("FamilyNameEn =", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenNotEqualTo(String value) {
            addCriterion("FamilyNameEn <>", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenGreaterThan(String value) {
            addCriterion("FamilyNameEn >", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenGreaterThanOrEqualTo(String value) {
            addCriterion("FamilyNameEn >=", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenLessThan(String value) {
            addCriterion("FamilyNameEn <", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenLessThanOrEqualTo(String value) {
            addCriterion("FamilyNameEn <=", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenLike(String value) {
            addCriterion("FamilyNameEn like", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenNotLike(String value) {
            addCriterion("FamilyNameEn not like", value, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenIn(List<String> values) {
            addCriterion("FamilyNameEn in", values, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenNotIn(List<String> values) {
            addCriterion("FamilyNameEn not in", values, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenBetween(String value1, String value2) {
            addCriterion("FamilyNameEn between", value1, value2, "familynameen");
            return (Criteria) this;
        }

        public Criteria andFamilynameenNotBetween(String value1, String value2) {
            addCriterion("FamilyNameEn not between", value1, value2, "familynameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenIsNull() {
            addCriterion("GivenNameEn is null");
            return (Criteria) this;
        }

        public Criteria andGivennameenIsNotNull() {
            addCriterion("GivenNameEn is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameenEqualTo(String value) {
            addCriterion("GivenNameEn =", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenNotEqualTo(String value) {
            addCriterion("GivenNameEn <>", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenGreaterThan(String value) {
            addCriterion("GivenNameEn >", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenGreaterThanOrEqualTo(String value) {
            addCriterion("GivenNameEn >=", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenLessThan(String value) {
            addCriterion("GivenNameEn <", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenLessThanOrEqualTo(String value) {
            addCriterion("GivenNameEn <=", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenLike(String value) {
            addCriterion("GivenNameEn like", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenNotLike(String value) {
            addCriterion("GivenNameEn not like", value, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenIn(List<String> values) {
            addCriterion("GivenNameEn in", values, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenNotIn(List<String> values) {
            addCriterion("GivenNameEn not in", values, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenBetween(String value1, String value2) {
            addCriterion("GivenNameEn between", value1, value2, "givennameen");
            return (Criteria) this;
        }

        public Criteria andGivennameenNotBetween(String value1, String value2) {
            addCriterion("GivenNameEn not between", value1, value2, "givennameen");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
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

        public Criteria andCertificationidIsNull() {
            addCriterion("CertificationID is null");
            return (Criteria) this;
        }

        public Criteria andCertificationidIsNotNull() {
            addCriterion("CertificationID is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationidEqualTo(Integer value) {
            addCriterion("CertificationID =", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotEqualTo(Integer value) {
            addCriterion("CertificationID <>", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThan(Integer value) {
            addCriterion("CertificationID >", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CertificationID >=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThan(Integer value) {
            addCriterion("CertificationID <", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidLessThanOrEqualTo(Integer value) {
            addCriterion("CertificationID <=", value, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidIn(List<Integer> values) {
            addCriterion("CertificationID in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotIn(List<Integer> values) {
            addCriterion("CertificationID not in", values, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidBetween(Integer value1, Integer value2) {
            addCriterion("CertificationID between", value1, value2, "certificationid");
            return (Criteria) this;
        }

        public Criteria andCertificationidNotBetween(Integer value1, Integer value2) {
            addCriterion("CertificationID not between", value1, value2, "certificationid");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNull() {
            addCriterion("InputDate is null");
            return (Criteria) this;
        }

        public Criteria andInputdateIsNotNull() {
            addCriterion("InputDate is not null");
            return (Criteria) this;
        }

        public Criteria andInputdateEqualTo(Date value) {
            addCriterion("InputDate =", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotEqualTo(Date value) {
            addCriterion("InputDate <>", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThan(Date value) {
            addCriterion("InputDate >", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateGreaterThanOrEqualTo(Date value) {
            addCriterion("InputDate >=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThan(Date value) {
            addCriterion("InputDate <", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateLessThanOrEqualTo(Date value) {
            addCriterion("InputDate <=", value, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateIn(List<Date> values) {
            addCriterion("InputDate in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotIn(List<Date> values) {
            addCriterion("InputDate not in", values, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateBetween(Date value1, Date value2) {
            addCriterion("InputDate between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andInputdateNotBetween(Date value1, Date value2) {
            addCriterion("InputDate not between", value1, value2, "inputdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("Version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("Picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("Picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("Picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("Picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("Picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("Picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("Picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("Picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("Picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("Picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("Picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("Picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("Picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitIsNull() {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit is null");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitIsNotNull() {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit is not null");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitEqualTo(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit =", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitNotEqualTo(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit <>", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitGreaterThan(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit >", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitGreaterThanOrEqualTo(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit >=", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitLessThan(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit <", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitLessThanOrEqualTo(Date value) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit <=", value, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitIn(List<Date> values) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit in", values, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitNotIn(List<Date> values) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit not in", values, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitBetween(Date value1, Date value2) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit between", value1, value2, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andLastemaildateforstaffinfochangingsubmitNotBetween(Date value1, Date value2) {
            addCriterion("LastEmailDateForStaffInfoChangingSubmit not between", value1, value2, "lastemaildateforstaffinfochangingsubmit");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathIsNull() {
            addCriterion("ResumeProveFilePath is null");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathIsNotNull() {
            addCriterion("ResumeProveFilePath is not null");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathEqualTo(String value) {
            addCriterion("ResumeProveFilePath =", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathNotEqualTo(String value) {
            addCriterion("ResumeProveFilePath <>", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathGreaterThan(String value) {
            addCriterion("ResumeProveFilePath >", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathGreaterThanOrEqualTo(String value) {
            addCriterion("ResumeProveFilePath >=", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathLessThan(String value) {
            addCriterion("ResumeProveFilePath <", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathLessThanOrEqualTo(String value) {
            addCriterion("ResumeProveFilePath <=", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathLike(String value) {
            addCriterion("ResumeProveFilePath like", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathNotLike(String value) {
            addCriterion("ResumeProveFilePath not like", value, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathIn(List<String> values) {
            addCriterion("ResumeProveFilePath in", values, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathNotIn(List<String> values) {
            addCriterion("ResumeProveFilePath not in", values, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathBetween(String value1, String value2) {
            addCriterion("ResumeProveFilePath between", value1, value2, "resumeprovefilepath");
            return (Criteria) this;
        }

        public Criteria andResumeprovefilepathNotBetween(String value1, String value2) {
            addCriterion("ResumeProveFilePath not between", value1, value2, "resumeprovefilepath");
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