package com.daimler.aftersales.entity;

import java.util.Date;

public class Userinfo {
    private Integer userid;

    private Integer cardtype;

    private String cardnumber;

    private String drivinglicense;

    private String familynamecn;

    private String givennamecn;

    private String familynameen;

    private String givennameen;

    private Date birthday;

    private Integer gender;

    private Integer qualificationid;

    private Integer certificationid;

    private Date inputdate;

    private Integer status;

    private Integer version;

    private String picture;

    private Date lastemaildateforstaffinfochangingsubmit;

    private String resumeprovefilepath;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber == null ? null : cardnumber.trim();
    }

    public String getDrivinglicense() {
        return drivinglicense;
    }

    public void setDrivinglicense(String drivinglicense) {
        this.drivinglicense = drivinglicense == null ? null : drivinglicense.trim();
    }

    public String getFamilynamecn() {
        return familynamecn;
    }

    public void setFamilynamecn(String familynamecn) {
        this.familynamecn = familynamecn == null ? null : familynamecn.trim();
    }

    public String getGivennamecn() {
        return givennamecn;
    }

    public void setGivennamecn(String givennamecn) {
        this.givennamecn = givennamecn == null ? null : givennamecn.trim();
    }

    public String getFamilynameen() {
        return familynameen;
    }

    public void setFamilynameen(String familynameen) {
        this.familynameen = familynameen == null ? null : familynameen.trim();
    }

    public String getGivennameen() {
        return givennameen;
    }

    public void setGivennameen(String givennameen) {
        this.givennameen = givennameen == null ? null : givennameen.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getQualificationid() {
        return qualificationid;
    }

    public void setQualificationid(Integer qualificationid) {
        this.qualificationid = qualificationid;
    }

    public Integer getCertificationid() {
        return certificationid;
    }

    public void setCertificationid(Integer certificationid) {
        this.certificationid = certificationid;
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getLastemaildateforstaffinfochangingsubmit() {
        return lastemaildateforstaffinfochangingsubmit;
    }

    public void setLastemaildateforstaffinfochangingsubmit(Date lastemaildateforstaffinfochangingsubmit) {
        this.lastemaildateforstaffinfochangingsubmit = lastemaildateforstaffinfochangingsubmit;
    }

    public String getResumeprovefilepath() {
        return resumeprovefilepath;
    }

    public void setResumeprovefilepath(String resumeprovefilepath) {
        this.resumeprovefilepath = resumeprovefilepath == null ? null : resumeprovefilepath.trim();
    }
}