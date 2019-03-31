package com.manage.controller;


import com.alibaba.fastjson.JSONObject;
import com.manage.entity.Warehouse;
import com.manage.service.WarehouseService;
import com.manage.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    /**
     * showdoc
     * @catalog 仓库模块
     * @title
     * @description 仓库的接口
     * @method post
     * @url localhost:8080/warehouse/add
     * @param warehouseId 必选 int 商品id
     * @param warehouseName 必选 string 商品id
     * @param warehouseType 必选 String 供应商号
     * @return {"status":1,data:{},msg:"新建仓库成功"}
     * @return_param status int 返回状态
     * @return_param data json 返回数据
     * @return_param msg string 返回信息
     * @remark head 默认为 string img/default.jpeg，检查账号是否重复
     * @number 99
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Object addWarehouse(@RequestBody JSONObject jsonparams, HttpSession httpSession){
        JsonResult jsonResult = new JsonResult();
        try{
            int warehouseId = jsonparams.getInteger("warehouseId");
            String warehouseName = jsonparams.getString("warehouseName");
            String warehouseType = jsonparams.getString("warehouseType");
            Warehouse warehouse = new Warehouse();
            warehouse.setWarehouseid(warehouseId);
            warehouse.setWarehousename(warehouseName);
            warehouse.setWarehousetype(warehouseType);
            System.out.println("warehouseName"+warehouseName);
            System.out.println("warehouseType"+warehouseType);
            warehouseService.addWarehouse(warehouse);
            jsonResult.setStatus(1);
            jsonResult.setMsg("添加仓库成功");
            return jsonResult;
        }catch (Exception e){
            System.out.println(e);
            jsonResult.setStatus(0);
            jsonResult.setMsg("添加仓库失败");
            return jsonResult;
        }
    }

    /**
     * showdoc
     * @catalog 仓库模块
     * @title
     * @description 仓库的接口
     * @method post
     * @url localhost:8080/warehouse/delete
     * @param warehouseId 必选 int 商品id
     * @return {"status":1,data:{},msg:"删除仓库成"}
     * @return_param status int 返回状态
     * @return_param data json 返回数据
     * @return_param msg string 返回信息
     * @remark head 默认为 string img/default.jpeg，检查账号是否重复
     * @number 99
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public  Object deleteWarehouse(@RequestBody JSONObject jsonparams, HttpSession httpSession){
        JsonResult jsonResult = new JsonResult();
        try{
            int warehouseId = jsonparams.getInteger("warehouseId");
            warehouseService.deletWarehouse(warehouseId);
            jsonResult.setStatus(1);
            jsonResult.setMsg("删除仓库成功");
            return  jsonResult;
        }catch (Exception e){
            System.out.println(e);
            jsonResult.setStatus(0);
            jsonResult.setMsg("删除失败成功");
            return  jsonResult;
        }
    }


    @RequestMapping(value = "/delete",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public  Object selectAll(@RequestBody JSONObject jsonparams, HttpSession httpSession){
        return "";
    }

}
