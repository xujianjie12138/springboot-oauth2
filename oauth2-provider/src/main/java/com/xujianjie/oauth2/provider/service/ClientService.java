package com.xujianjie.oauth2.provider.service;

import com.xujianjie.oauth2.provider.model.Client;

public interface ClientService
{
    Client findByAccount(String account);
}
