package com.daimler.aftersales.entity;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
public class CertificationPOJO {
    private Integer ID;
    private String identityCard;
    private String name;
    private Timestamp acquiredDate;
    private Timestamp createDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String indentityCard) {
        this.identityCard = indentityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getAcquiredDate() {
        return acquiredDate;
    }

    public void setAcquiredDate(Timestamp acquiredDate) {
        this.acquiredDate = acquiredDate;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "CertificationPOJO{" +
                "ID=" + ID +
                ", indentityCard='" + identityCard + '\'' +
                ", name='" + name + '\'' +
                ", acquiredDate=" + acquiredDate +
                ", createDate=" + createDate +
                '}';
    }
}
