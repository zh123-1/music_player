package com.example.UserAdmin.mapper;

import com.example.UserAdmin.pojo.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    void insert(User user);
}
