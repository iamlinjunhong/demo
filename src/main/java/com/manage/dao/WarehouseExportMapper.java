package com.manage.dao;

import com.manage.entity.WarehouseExport;

public interface WarehouseExportMapper {
    int deleteByPrimaryKey(Integer exportid);

    int insert(WarehouseExport record);

    int insertSelective(WarehouseExport record);

    WarehouseExport selectByPrimaryKey(Integer exportid);

    int updateByPrimaryKeySelective(WarehouseExport record);

    int updateByPrimaryKey(WarehouseExport record);
}