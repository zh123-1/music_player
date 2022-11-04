package com.example.controller;

import com.example.pojo.User;
import com.example.response.ResponseResult;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value = "API - UserController",description = "用户模块接口详情")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(value = "/insert")
   // @RequestMapping(value = "/queryUserByName",method = RequestMethod.GET)
    @ApiOperation(value = "根据用户名称查询服务")
    public ResponseResult userInsert(@RequestBody User user){
        userService.insert(user);
        return new ResponseResult(0,"success",null);
    }


}
