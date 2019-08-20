package com.xujianjie.oauth2.provider.config.auth.service;

import com.xujianjie.oauth2.provider.config.auth.model.MyClientDetails;
import com.xujianjie.oauth2.provider.model.Client;
import com.xujianjie.oauth2.provider.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

@Service
public class MyClientDetailsService implements ClientDetailsService
{
    @Autowired
    private ClientService clientService;

    @Override
    public ClientDetails loadClientByClientId(String account) throws ClientRegistrationException
    {
        Client client = clientService.findByAccount(account);
        if (client == null)
        {
            throw new ClientRegistrationException("企业客户未注册！");
        }

        return new MyClientDetails(client);
    }
}
