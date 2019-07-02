package com.smart.repo.dao;

import com.smart.models.user.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    UserEntity selectUserById(Integer userId);
}
