package com.xujianjie.oauth2.client.service;

import com.xujianjie.oauth2.client.model.po.User;

public interface UserService
{
    User addUser(User user);

    User findById(int userId);

    User updateUser(User user);

    User validateUser(String account, String password);

    User findThirdUser(int userId);
}
