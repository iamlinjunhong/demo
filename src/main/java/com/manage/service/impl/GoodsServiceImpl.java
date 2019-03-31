package com.manage.service.impl;


import com.manage.dao.GoodsMapper;
import com.manage.entity.Goods;
import com.manage.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public int addGoods(Goods goods){
        return goodsMapper.insertSelective(goods);
    }
}
