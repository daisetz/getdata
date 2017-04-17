package com.daimler.aftersales.entity;

public class Qualification {
    private Integer qualificationid;

    private String qualificationcn;

    private String qualificationen;

    private Integer sort;

    public Integer getQualificationid() {
        return qualificationid;
    }

    public void setQualificationid(Integer qualificationid) {
        this.qualificationid = qualificationid;
    }

    public String getQualificationcn() {
        return qualificationcn;
    }

    public void setQualificationcn(String qualificationcn) {
        this.qualificationcn = qualificationcn == null ? null : qualificationcn.trim();
    }

    public String getQualificationen() {
        return qualificationen;
    }

    public void setQualificationen(String qualificationen) {
        this.qualificationen = qualificationen == null ? null : qualificationen.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}