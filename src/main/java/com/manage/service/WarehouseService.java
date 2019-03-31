package com.manage.service;

import com.manage.entity.Warehouse;

public interface WarehouseService {
    int addWarehouse(Warehouse  warehouse);

    int deletWarehouse(int warehouseId);
}
