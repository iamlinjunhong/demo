package com.manage.entity;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Integer warehouseid;

    private Integer goodsnumber;

    private String singleprice;

    private String planprice;

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

    public String getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(String singleprice) {
        this.singleprice = singleprice == null ? null : singleprice.trim();
    }

    public String getPlanprice() {
        return planprice;
    }

    public void setPlanprice(String planprice) {
        this.planprice = planprice == null ? null : planprice.trim();
    }
}