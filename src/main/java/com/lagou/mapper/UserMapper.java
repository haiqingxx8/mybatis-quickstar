package com.lagou.mapper;

import com.lagou.domain.Order;
import com.lagou.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
