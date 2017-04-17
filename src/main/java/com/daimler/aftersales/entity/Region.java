package com.daimler.aftersales.entity;

public class Region {
    private Integer regionid;

    private String regionnamecn;

    private String regionnameen;

    private String regionshortnamecn;

    private String regionshortnameen;

    private Integer mbcldepartmentid;

    private Integer sort;

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getRegionnamecn() {
        return regionnamecn;
    }

    public void setRegionnamecn(String regionnamecn) {
        this.regionnamecn = regionnamecn == null ? null : regionnamecn.trim();
    }

    public String getRegionnameen() {
        return regionnameen;
    }

    public void setRegionnameen(String regionnameen) {
        this.regionnameen = regionnameen == null ? null : regionnameen.trim();
    }

    public String getRegionshortnamecn() {
        return regionshortnamecn;
    }

    public void setRegionshortnamecn(String regionshortnamecn) {
        this.regionshortnamecn = regionshortnamecn == null ? null : regionshortnamecn.trim();
    }

    public String getRegionshortnameen() {
        return regionshortnameen;
    }

    public void setRegionshortnameen(String regionshortnameen) {
        this.regionshortnameen = regionshortnameen == null ? null : regionshortnameen.trim();
    }

    public Integer getMbcldepartmentid() {
        return mbcldepartmentid;
    }

    public void setMbcldepartmentid(Integer mbcldepartmentid) {
        this.mbcldepartmentid = mbcldepartmentid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}