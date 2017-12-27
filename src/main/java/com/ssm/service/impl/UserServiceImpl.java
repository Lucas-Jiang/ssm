package com.ssm.service.impl;


import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * create by lucas on 2017/12/19
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}