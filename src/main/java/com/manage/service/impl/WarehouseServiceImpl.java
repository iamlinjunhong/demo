package com.manage.service.impl;

import com.manage.dao.WarehouseMapper;
import com.manage.entity.Warehouse;
import com.manage.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseMapper warehouseMapper;


    @Override
    public int addWarehouse(Warehouse warehouse){
        return warehouseMapper.insertSelective(warehouse);
    }

    @Override
    public int deletWarehouse(int warehouseId){
        return warehouseMapper.deleteByPrimaryKey(warehouseId);
    }

}
