package com.example.UserAdmin.service.impl;

import com.example.UserAdmin.mapper.UserMapper;
import com.example.UserAdmin.pojo.User;
import com.example.UserAdmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
