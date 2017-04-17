package com.daimler.aftersales.entity;

public class Dealerformatcode {
    private Integer formatcodeid;

    private String formatcode;

    private Integer formatid;

    private Integer formatlevel;

    public Integer getFormatcodeid() {
        return formatcodeid;
    }

    public void setFormatcodeid(Integer formatcodeid) {
        this.formatcodeid = formatcodeid;
    }

    public String getFormatcode() {
        return formatcode;
    }

    public void setFormatcode(String formatcode) {
        this.formatcode = formatcode == null ? null : formatcode.trim();
    }

    public Integer getFormatid() {
        return formatid;
    }

    public void setFormatid(Integer formatid) {
        this.formatid = formatid;
    }

    public Integer getFormatlevel() {
        return formatlevel;
    }

    public void setFormatlevel(Integer formatlevel) {
        this.formatlevel = formatlevel;
    }
}