package com.daimler.aftersales.entity;

import java.util.Date;

public class Dealeraccount {
    private Integer dealeraccountid;

    private Integer companyid;

    private Integer dealerid;

    private Integer positiontypeid;

    private Long positionid;

    private Long departmentid;

    private String division;

    private Integer changestatus;

    private String zipcode;

    private Date updatedate;

    private Integer applystatus;

    private Date proxyperiod;

    public Integer getDealeraccountid() {
        return dealeraccountid;
    }

    public void setDealeraccountid(Integer dealeraccountid) {
        this.dealeraccountid = dealeraccountid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getDealerid() {
        return dealerid;
    }

    public void setDealerid(Integer dealerid) {
        this.dealerid = dealerid;
    }

    public Integer getPositiontypeid() {
        return positiontypeid;
    }

    public void setPositiontypeid(Integer positiontypeid) {
        this.positiontypeid = positiontypeid;
    }

    public Long getPositionid() {
        return positionid;
    }

    public void setPositionid(Long positionid) {
        this.positionid = positionid;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division == null ? null : division.trim();
    }

    public Integer getChangestatus() {
        return changestatus;
    }

    public void setChangestatus(Integer changestatus) {
        this.changestatus = changestatus;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Integer getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(Integer applystatus) {
        this.applystatus = applystatus;
    }

    public Date getProxyperiod() {
        return proxyperiod;
    }

    public void setProxyperiod(Date proxyperiod) {
        this.proxyperiod = proxyperiod;
    }
}