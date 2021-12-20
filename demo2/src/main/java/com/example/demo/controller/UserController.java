package com.example.demo.controller;

import com.example.demo.mapper.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/demo2")
    public List<User> users(){

        return userService.list();
    }
}
