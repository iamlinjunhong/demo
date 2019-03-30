package com.manage.service;

import com.manage.entity.User;

import java.util.List;

public interface UserService {
    String findAllUser(int pageNum, int pageSize);
}
