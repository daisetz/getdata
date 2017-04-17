package com.daimler.aftersales.entity;

public class Dealergroup {
    private Integer id;

    private String dealergroupcn;

    private String dealergroupen;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDealergroupcn() {
        return dealergroupcn;
    }

    public void setDealergroupcn(String dealergroupcn) {
        this.dealergroupcn = dealergroupcn == null ? null : dealergroupcn.trim();
    }

    public String getDealergroupen() {
        return dealergroupen;
    }

    public void setDealergroupen(String dealergroupen) {
        this.dealergroupen = dealergroupen == null ? null : dealergroupen.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}