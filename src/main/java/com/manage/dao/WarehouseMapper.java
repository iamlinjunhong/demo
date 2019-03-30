package com.manage.dao;

import com.manage.entity.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer warehouseid);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(Integer warehouseid);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}