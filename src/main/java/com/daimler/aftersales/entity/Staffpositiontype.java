package com.daimler.aftersales.entity;

public class Staffpositiontype {
    private Integer staffpositiontypeid;

    private String namecn;

    private String nameen;

    public Integer getStaffpositiontypeid() {
        return staffpositiontypeid;
    }

    public void setStaffpositiontypeid(Integer staffpositiontypeid) {
        this.staffpositiontypeid = staffpositiontypeid;
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
}