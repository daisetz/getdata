package com.daimler.aftersales.entity;

/**
 * Created by zhuyuchao on 2017/3/3.
 */
public class CityPOJO {
    private Integer cityID;
    private Integer provinceID;
    private String cityNameCn;
    private String cityNameEn;
    private Integer cityLevel;
    private Integer sort;

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public Integer getProvinceID() {
        return provinceID;
    }

    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public String getCityNameCn() {
        return cityNameCn;
    }

    public void setCityNameCn(String cityNameCn) {
        this.cityNameCn = cityNameCn;
    }

    public String getCityNameEn() {
        return cityNameEn;
    }

    public void setCityNameEn(String cityNameEn) {
        this.cityNameEn = cityNameEn;
    }

    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "CityPOJO{" +
                "cityID=" + cityID +
                ", provinceID=" + provinceID +
                ", cityNameCn='" + cityNameCn + '\'' +
                ", cityNameEn='" + cityNameEn + '\'' +
                ", cityLevel=" + cityLevel +
                ", sort=" + sort +
                '}';
    }
}
