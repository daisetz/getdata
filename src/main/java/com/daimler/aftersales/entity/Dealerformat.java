package com.daimler.aftersales.entity;

public class Dealerformat {
    private Integer formatid;

    private String formatnamecn;

    private String formatnameen;

    private String formatshortname;

    private Integer sort;

    public Integer getFormatid() {
        return formatid;
    }

    public void setFormatid(Integer formatid) {
        this.formatid = formatid;
    }

    public String getFormatnamecn() {
        return formatnamecn;
    }

    public void setFormatnamecn(String formatnamecn) {
        this.formatnamecn = formatnamecn == null ? null : formatnamecn.trim();
    }

    public String getFormatnameen() {
        return formatnameen;
    }

    public void setFormatnameen(String formatnameen) {
        this.formatnameen = formatnameen == null ? null : formatnameen.trim();
    }

    public String getFormatshortname() {
        return formatshortname;
    }

    public void setFormatshortname(String formatshortname) {
        this.formatshortname = formatshortname == null ? null : formatshortname.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}