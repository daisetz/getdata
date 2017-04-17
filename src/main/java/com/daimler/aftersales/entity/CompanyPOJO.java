package com.daimler.aftersales.entity;

import java.sql.Timestamp;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
public class CompanyPOJO {

    private Integer companyID;
    private String companyNameCn;
    private String companyNameEn;
    private String registeredAddressCn;
    private String registeredAddressEn;
    private String zip;
    private Timestamp inputDate;
    private Integer createMbclAccountID;
    private Integer status;

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getCompanyNameCn() {
        return companyNameCn;
    }

    public void setCompanyNameCn(String companyNameCn) {
        this.companyNameCn = companyNameCn;
    }

    public String getCompanyNameEn() {
        return companyNameEn;
    }

    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn;
    }

    public String getRegisteredAddressCn() {
        return registeredAddressCn;
    }

    public void setRegisteredAddressCn(String registeredAddressCn) {
        this.registeredAddressCn = registeredAddressCn;
    }

    public String getRegisteredAddressEn() {
        return registeredAddressEn;
    }

    public void setRegisteredAddressEn(String registeredAddressEn) {
        this.registeredAddressEn = registeredAddressEn;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Timestamp getInputDate() {
        return inputDate;
    }

    public void setInputDate(Timestamp inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getCreateMbclAccountID() {
        return createMbclAccountID;
    }

    public void setCreateMbclAccountID(Integer createMbclAccountID) {
        this.createMbclAccountID = createMbclAccountID;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CompanyPOJO{" +
                "companyID=" + companyID +
                ", companyNameCn='" + companyNameCn + '\'' +
                ", companyNameEn='" + companyNameEn + '\'' +
                ", registeredAddressCn='" + registeredAddressCn + '\'' +
                ", registeredAddressEn='" + registeredAddressEn + '\'' +
                ", zip='" + zip + '\'' +
                ", inputDate=" + inputDate +
                ", createMbclAccountID=" + createMbclAccountID +
                ", status=" + status +
                '}';
    }
}
