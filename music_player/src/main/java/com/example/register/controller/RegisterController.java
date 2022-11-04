package com.example.register.controller;

import com.example.UserAdmin.response.ResponseResult;
import com.example.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.register.service.RegisterService;

/**
 * 用户注册
 */
@RestController
@RequestMapping("/register")
@Api(value = "API - registerController",description = "用户注册")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    @ApiOperation(value = "注册账号")
    public ResponseResult register(@RequestBody UserVo userVo){

        try {
            registerService.registerService(userVo);
            return new ResponseResult(0,"账号注册成功",null);
        }catch (Exception e){
            return new ResponseResult(0,"账号注册失败",null);
        }
    }
}
