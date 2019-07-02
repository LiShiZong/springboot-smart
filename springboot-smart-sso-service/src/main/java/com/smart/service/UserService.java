package com.smart.service;

import com.smart.models.user.UserEntity;

public interface UserService {
    UserEntity getUserById(Integer userId);
}
