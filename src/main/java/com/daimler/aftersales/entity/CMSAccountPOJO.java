package com.daimler.aftersales.entity;

import java.util.Date;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
public class CMSAccountPOJO {
    private Integer accountId;
    private Integer userID;
    private String name;
    private String hashPassword;
    private Integer status;
    private Date createDate;
    private String email;
    private String phoneCountryNo;
    private String phoneAreaNo;
    private String phoneNo;
    private String faxCountryNo;
    private String faxAreaNo;
    private String faxNo;
    private String mobilePhoneCountryNo;
    private String mobilePhoneNo;
    private Integer version;
    private String dimissionReasonID;
    private Integer isActiveDemission;
    private Date demissionDate;
    private Date passwordChangeDate;
    private Integer passwordChangeNotifyStatus;
    private String remarks;
    private Date positionChangeDate;
    private Integer isUpdatedByExcel;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneCountryNo() {
        return phoneCountryNo;
    }

    public void setPhoneCountryNo(String phoneCountryNo) {
        this.phoneCountryNo = phoneCountryNo;
    }

    public String getPhoneAreaNo() {
        return phoneAreaNo;
    }

    public void setPhoneAreaNo(String phoneAreaNo) {
        this.phoneAreaNo = phoneAreaNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFaxCountryNo() {
        return faxCountryNo;
    }

    public void setFaxCountryNo(String faxCountryNo) {
        this.faxCountryNo = faxCountryNo;
    }

    public String getFaxAreaNo() {
        return faxAreaNo;
    }

    public void setFaxAreaNo(String faxAreaNo) {
        this.faxAreaNo = faxAreaNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getMobilePhoneCountryNo() {
        return mobilePhoneCountryNo;
    }

    public void setMobilePhoneCountryNo(String mobilePhoneCountryNo) {
        this.mobilePhoneCountryNo = mobilePhoneCountryNo;
    }

    public String getMobilePhoneNo() {
        return mobilePhoneNo;
    }

    public void setMobilePhoneNo(String mobilePhoneNo) {
        this.mobilePhoneNo = mobilePhoneNo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDimissionReasonID() {
        return dimissionReasonID;
    }

    public void setDimissionReasonID(String dimissionReasonID) {
        this.dimissionReasonID = dimissionReasonID;
    }

    public Integer getIsActiveDemission() {
        return isActiveDemission;
    }

    public void setIsActiveDemission(Integer isActiveDemission) {
        this.isActiveDemission = isActiveDemission;
    }

    public Date getDemissionDate() {
        return demissionDate;
    }

    public void setDemissionDate(Date demissionDate) {
        this.demissionDate = demissionDate;
    }

    public Date getPasswordChangeDate() {
        return passwordChangeDate;
    }

    public void setPasswordChangeDate(Date passwordChangeDate) {
        this.passwordChangeDate = passwordChangeDate;
    }

    public Integer getPasswordChangeNotifyStatus() {
        return passwordChangeNotifyStatus;
    }

    public void setPasswordChangeNotifyStatus(Integer passwordChangeNotifyStatus) {
        this.passwordChangeNotifyStatus = passwordChangeNotifyStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getPositionChangeDate() {
        return positionChangeDate;
    }

    public void setPositionChangeDate(Date positionChangeDate) {
        this.positionChangeDate = positionChangeDate;
    }

    public Integer getIsUpdatedByExcel() {
        return isUpdatedByExcel;
    }

    public void setIsUpdatedByExcel(Integer isUpdatedByExcel) {
        this.isUpdatedByExcel = isUpdatedByExcel;
    }

    @Override
    public String toString() {
        return "CMSAccountPOJO{" +
                "accountId=" + accountId +
                ", userID=" + userID +
                ", name='" + name + '\'' +
                ", hashPassword='" + hashPassword + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", email='" + email + '\'' +
                ", phoneCountryNo='" + phoneCountryNo + '\'' +
                ", phoneAreaNo='" + phoneAreaNo + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", faxCountryNo='" + faxCountryNo + '\'' +
                ", faxAreaNo='" + faxAreaNo + '\'' +
                ", faxNo='" + faxNo + '\'' +
                ", mobilePhoneCountryNo='" + mobilePhoneCountryNo + '\'' +
                ", mobilePhoneNo='" + mobilePhoneNo + '\'' +
                ", version=" + version +
                ", dimissionReasonID=" + dimissionReasonID +
                ", isActiveDemission=" + isActiveDemission +
                ", demissionDate=" + demissionDate +
                ", passwordChangeDate=" + passwordChangeDate +
                ", passwordChangeNotifyStatus=" + passwordChangeNotifyStatus +
                ", remarks='" + remarks + '\'' +
                ", positionChangeDate=" + positionChangeDate +
                ", isUpdatedByExcel=" + isUpdatedByExcel +
                '}';
    }
}
