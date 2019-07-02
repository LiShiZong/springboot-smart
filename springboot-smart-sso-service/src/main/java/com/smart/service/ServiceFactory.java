package com.smart.service;

import com.smart.service.impl.UserServiceImpl;

public class ServiceFactory {
    public static UserService getServiceImpl() {
        UserService userService = null;
        userService = new UserServiceImpl();
        return userService;
    }
}
