package com.manage.service.impl;

import com.manage.util.PageSerializable;
import com.github.pagehelper.PageHelper;
import com.manage.util.PageInfo;
import com.manage.dao.UserMapper;
import com.manage.entity.User;
import com.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String findAllUser(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize,"id desc");
        List<User>userList =userMapper.selectAll();
        PageInfo<User>pageInfo = new PageInfo<>(userList);
        return pageInfo.toString();
    }
}
