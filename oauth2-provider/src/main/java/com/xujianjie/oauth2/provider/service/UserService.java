package com.xujianjie.oauth2.provider.service;

import com.xujianjie.oauth2.provider.model.User;

public interface UserService
{
    User findByAccount(String  account);
}
