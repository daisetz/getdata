package com.daimler.aftersales.entity;

public class Dimissionreason {
    private Integer dimissionreasonid;

    private String reason;

    private Integer parentid;

    public Integer getDimissionreasonid() {
        return dimissionreasonid;
    }

    public void setDimissionreasonid(Integer dimissionreasonid) {
        this.dimissionreasonid = dimissionreasonid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}