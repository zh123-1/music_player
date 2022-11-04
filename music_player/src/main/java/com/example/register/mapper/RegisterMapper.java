package com.example.register.mapper;

import com.example.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {
    //账号注册
    void registerInsert(UserVo userVo);
}
