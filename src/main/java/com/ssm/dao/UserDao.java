package com.ssm.dao;

import com.ssm.model.User;

/**
 * create by lucas on 2017/12/19
 */
public interface UserDao {

    User selectUser(long id);
}
