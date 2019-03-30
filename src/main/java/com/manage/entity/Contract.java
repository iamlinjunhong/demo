package com.manage.entity;

public class Contract {
    private Integer contractid;

    private Integer goodsid;

    private String contractshop;

    private Integer contractnumber;

    private Integer singleprice;

    private Integer realnumber;

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getContractshop() {
        return contractshop;
    }

    public void setContractshop(String contractshop) {
        this.contractshop = contractshop == null ? null : contractshop.trim();
    }

    public Integer getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(Integer contractnumber) {
        this.contractnumber = contractnumber;
    }

    public Integer getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(Integer singleprice) {
        this.singleprice = singleprice;
    }

    public Integer getRealnumber() {
        return realnumber;
    }

    public void setRealnumber(Integer realnumber) {
        this.realnumber = realnumber;
    }
}