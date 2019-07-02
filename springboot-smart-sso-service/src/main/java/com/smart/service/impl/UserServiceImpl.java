package com.smart.service.impl;

import com.smart.models.user.UserEntity;
import com.smart.repo.dao.UserDao;
import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserEntity getUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }
}
