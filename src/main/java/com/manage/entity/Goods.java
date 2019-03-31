package com.manage.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer warehouseid;

    private Integer goodsnumber;

    private Integer singleprice;

    private Integer planprice;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    public Integer getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Integer singleprice) {
        this.singleprice = singleprice;
    }

    public Integer getPlanprice() {
        return planprice;
    }

    public void setPlanprice(Integer planprice) {
        this.planprice = planprice;
    }
}