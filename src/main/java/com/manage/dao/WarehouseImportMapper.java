package com.manage.dao;

import com.manage.entity.WarehouseImport;

public interface WarehouseImportMapper {
    int deleteByPrimaryKey(Integer importid);

    int insert(WarehouseImport record);

    int insertSelective(WarehouseImport record);

    WarehouseImport selectByPrimaryKey(Integer importid);

    int updateByPrimaryKeySelective(WarehouseImport record);

    int updateByPrimaryKey(WarehouseImport record);
}