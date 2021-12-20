package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface UserMapper {
    int save(User user);
    int update(@Param("email") String email, @Param("lastLoginTime") LocalDateTime lastLoginTime);
    User findByEmailAndPassword(@Param("email")String email, @Param("password")String password);
    String findEmail(@Param("email") String email);
    List<User> findAll();
}