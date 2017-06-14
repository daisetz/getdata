package com.daimler.aftersales.entity;

/**
 * Created by zhuyuchao on 2017/6/13.
 */
public class RelationAccountPositionPOJO {
    private Integer accountid;
    private Long positionid;
    private Long departmentid;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Long getPositionid() {
        return positionid;
    }

    public void setPositionid(Long positionid) {
        this.positionid = positionid;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }
}
