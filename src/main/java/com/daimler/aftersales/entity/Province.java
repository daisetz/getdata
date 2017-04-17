package com.daimler.aftersales.entity;

public class Province {
    private Integer provinceid;

    private String provincenamecn;

    private String provincenameen;

    private Integer sort;

    private String provinceshortnamecn;

    private String provinceshortnameen;

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincenamecn() {
        return provincenamecn;
    }

    public void setProvincenamecn(String provincenamecn) {
        this.provincenamecn = provincenamecn == null ? null : provincenamecn.trim();
    }

    public String getProvincenameen() {
        return provincenameen;
    }

    public void setProvincenameen(String provincenameen) {
        this.provincenameen = provincenameen == null ? null : provincenameen.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getProvinceshortnamecn() {
        return provinceshortnamecn;
    }

    public void setProvinceshortnamecn(String provinceshortnamecn) {
        this.provinceshortnamecn = provinceshortnamecn == null ? null : provinceshortnamecn.trim();
    }

    public String getProvinceshortnameen() {
        return provinceshortnameen;
    }

    public void setProvinceshortnameen(String provinceshortnameen) {
        this.provinceshortnameen = provinceshortnameen == null ? null : provinceshortnameen.trim();
    }
}