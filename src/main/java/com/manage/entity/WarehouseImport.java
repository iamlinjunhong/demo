package com.manage.entity;

import java.util.Date;

public class WarehouseImport {
    private Integer importid;

    private Date entrydate;

    private Integer warehouseid;

    private Integer goodsid;

    private Integer importnumber;

    private Integer contractid;

    public Integer getImportid() {
        return importid;
    }

    public void setImportid(Integer importid) {
        this.importid = importid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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

    public Integer getImportnumber() {
        return importnumber;
    }

    public void setImportnumber(Integer importnumber) {
        this.importnumber = importnumber;
    }

    public Integer getContractid() {
        return contractid;
    }

    public void setContractid(Integer contractid) {
        this.contractid = contractid;
    }
}