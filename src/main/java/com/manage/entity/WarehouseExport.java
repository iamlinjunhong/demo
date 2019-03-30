package com.manage.entity;

import java.util.Date;

public class WarehouseExport {
    private Integer exportid;

    private Date exportdate;

    private Integer warehouseid;

    private Integer goodsid;

    private Integer exportnumber;

    private Integer orderid;

    public Integer getExportid() {
        return exportid;
    }

    public void setExportid(Integer exportid) {
        this.exportid = exportid;
    }

    public Date getExportdate() {
        return exportdate;
    }

    public void setExportdate(Date exportdate) {
        this.exportdate = exportdate;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getExportnumber() {
        return exportnumber;
    }

    public void setExportnumber(Integer exportnumber) {
        this.exportnumber = exportnumber;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}