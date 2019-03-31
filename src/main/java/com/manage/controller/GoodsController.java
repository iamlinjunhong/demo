package com.manage.controller;


import com.alibaba.fastjson.JSONObject;
import com.manage.entity.Goods;
import com.manage.service.GoodsService;
import com.manage.service.impl.GoodsServiceImpl;
import com.manage.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;


    /**
     * showdoc
     * @catalog 商品模块
     * @title
     * @description 商品的接口
     * @method post
     * @url localhost:8080/goods/add
     * @param goodsId 必选 int 商品id
     * @param goodsName 必选 String 商品名称
     * @param warehouseId 必选 id 仓库id
     * @param goodsNumber 必选 int 商品数量
     * @param singlePrice 必选 int 供应单价
     * @param planPrice 必选 int 计划单价
     * @return {"status":1,msg:"新建合同成功"}
     * @return_param status string 返回结果
     * @return_param msg string 返回信息，0为成功
     * @remark head 默认为 string img/default.jpeg，检查账号是否重复
     * @number 99
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public Object addGoods(@RequestBody JSONObject jsonParam, HttpSession httpSession){
        JsonResult jsonResult = new JsonResult();
        try{
            int goodsId = jsonParam.getInteger("goodsId");
            String goodsName = jsonParam.getString("goodsName");
            int warehouseId = jsonParam.getInteger("warehouseId");
            int goodsNumber = jsonParam.getInteger("goodsNumber");
            int singlePrice = jsonParam.getInteger("singlePrice");
            int planPrice = jsonParam.getInteger("planPrice");
            Goods goods = new Goods();
            goods.setGoodsid(goodsId);
            goods.setGoodsname(goodsName);
            goods.setWarehouseid(warehouseId);
            goods.setGoodsnumber(goodsNumber);
            goods.setSingleprice(singlePrice);
            goods.setPlanprice(planPrice);
            goodsService.addGoods(goods);
            jsonResult.setStatus(1);
            jsonResult.setMsg("新增商品成功");
            return jsonResult;
        }catch (Exception e){
            System.out.println(e);
            jsonResult.setStatus(0);
            jsonResult.setMsg("新增商品失败");
            return jsonResult;
        }
    }
}
