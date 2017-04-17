package com.daimler.aftersales.entity;

public class Ochartcustom {
    private Long ochartid;

    private Integer companyid;

    private Integer dealerid;

    private Long parentid;

    private String namecn;

    private String nameen;

    private String descriptioncn;

    private String descriptionen;

    private Integer sort;

    public Long getOchartid() {
        return ochartid;
    }

    public void setOchartid(Long ochartid) {
        this.ochartid = ochartid;
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

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getNameen() {
        return nameen;
    }

    public void setNameen(String nameen) {
        this.nameen = nameen == null ? null : nameen.trim();
    }

    public String getDescriptioncn() {
        return descriptioncn;
    }

    public void setDescriptioncn(String descriptioncn) {
        this.descriptioncn = descriptioncn == null ? null : descriptioncn.trim();
    }

    public String getDescriptionen() {
        return descriptionen;
    }

    public void setDescriptionen(String descriptionen) {
        this.descriptionen = descriptionen == null ? null : descriptionen.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}