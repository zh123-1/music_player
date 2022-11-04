package com.example.register.service.impl;

import com.example.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.register.mapper.RegisterMapper;
import com.example.register.service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    public void registerService(UserVo userVo) {
        registerMapper.registerInsert(userVo);
    }
}
