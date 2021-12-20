package com.example.demo.mapper;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
 @Component
    @FeignClient(value = "USER-SERVICE")
    public interface UserService {
        @GetMapping("/demo1")
        List<User> list();
}
