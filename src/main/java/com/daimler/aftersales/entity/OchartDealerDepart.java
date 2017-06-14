package com.daimler.aftersales.entity;

/**
 * Created by zhuyuchao on 2017/6/13.
 */
public class OchartDealerDepart {
    private Integer id;
    private Integer dealerid;
    private Integer departstandard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDealerid() {
        return dealerid;
    }

    public void setDealerid(Integer dealerid) {
        this.dealerid = dealerid;
    }


    public Integer getDepartstandard() {
        return departstandard;
    }

    public void setDepartstandard(Integer departstandard) {
        this.departstandard = departstandard;
    }

    @Override
    public String toString() {
        return "OchartDealerDepart{" +
                "id=" + id +
                ", dealerid=" + dealerid +
                ", departstandard=" + departstandard +
                '}';
    }
}
