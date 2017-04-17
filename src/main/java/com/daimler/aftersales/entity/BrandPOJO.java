package com.daimler.aftersales.entity;

/**
 * Created by zhuyuchao on 2017/3/1.
 */
public class BrandPOJO {
    private Integer brandID;
    private String brandNameCn;
    private String brandIconCn;
    private String brandNameEn;
    private String brandIconEn;
    private Integer sort;
    private String shortName;


    public String getBrandNameCn() {
        return brandNameCn;
    }

    public void setBrandNameCn(String brandNameCn) {
        this.brandNameCn = brandNameCn;
    }

    public String getBrandIconCn() {
        return brandIconCn;
    }

    public void setBrandIconCn(String brandIconCn) {
        this.brandIconCn = brandIconCn;
    }

    public String getBrandNameEn() {
        return brandNameEn;
    }

    public void setBrandNameEn(String brandNameEn) {
        this.brandNameEn = brandNameEn;
    }

    public String getBrandIconEn() {
        return brandIconEn;
    }

    public void setBrandIconEn(String brandIconEn) {
        this.brandIconEn = brandIconEn;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "BrandPOJO{" +
                "brandID=" + brandID +
                ", brandNameCn='" + brandNameCn + '\'' +
                ", brandIconCn='" + brandIconCn + '\'' +
                ", brandNameEn='" + brandNameEn + '\'' +
                ", brandIconEn='" + brandIconEn + '\'' +
                ", sort=" + sort +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
