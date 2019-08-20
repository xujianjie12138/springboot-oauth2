package com.xujianjie.oauth2.provider.controller;

import com.xujianjie.oauth2.provider.model.User;
import com.xujianjie.oauth2.provider.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public User info(Principal principal)
    {
        User user = userService.findByAccount(principal.getName());
        user.setPassword("");

        return user;
    }
}