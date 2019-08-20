package com.xujianjie.oauth2.provider.service.impl;

import com.xujianjie.oauth2.provider.mapper.UserMapper;
import com.xujianjie.oauth2.provider.model.User;
import com.xujianjie.oauth2.provider.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByAccount(String account)
    {
        return userMapper.findByAccount(account);
    }
}
