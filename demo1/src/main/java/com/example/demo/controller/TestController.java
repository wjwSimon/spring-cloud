package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
        @Autowired
        private UserMapper userMapper;
        @RequestMapping("/user")
        public String save(Model model){
            model.addAttribute("user",userMapper.findAll());
            return "user";
        }


}