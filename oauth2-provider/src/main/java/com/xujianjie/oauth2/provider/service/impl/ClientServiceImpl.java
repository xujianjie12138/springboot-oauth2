package com.xujianjie.oauth2.provider.service.impl;

import com.xujianjie.oauth2.provider.mapper.ClientMapper;
import com.xujianjie.oauth2.provider.model.Client;
import com.xujianjie.oauth2.provider.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ClientServiceImpl implements ClientService
{
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public Client findByAccount(String account)
    {
        return clientMapper.findByAccount(account);
    }
}
