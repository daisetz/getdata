package com.daimler.aftersales.entity;

public class Dealerowner {
    private Integer dealerownerid;

    private String ownernamecn;

    private String ownernameen;

    private Integer sort;

    public Integer getDealerownerid() {
        return dealerownerid;
    }

    public void setDealerownerid(Integer dealerownerid) {
        this.dealerownerid = dealerownerid;
    }

    public String getOwnernamecn() {
        return ownernamecn;
    }

    public void setOwnernamecn(String ownernamecn) {
        this.ownernamecn = ownernamecn == null ? null : ownernamecn.trim();
    }

    public String getOwnernameen() {
        return ownernameen;
    }

    public void setOwnernameen(String ownernameen) {
        this.ownernameen = ownernameen == null ? null : ownernameen.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}