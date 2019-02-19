package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/get.do")
    public User get() {
        return userService.getUser(1L);
    }

    @RequestMapping("/add.do")
    public int add() {
        User user = new User();
        user.setUsername("来自数据库第二条");
        user.setAge(33);
        user.setPassword("test password");
        return userService.add(user);
    }

    @RequestMapping("/update.do")
    public int update() {
        User user = userService.getUser(2L);
        user.setPassword("modify password");
        return userService.update(user);
    }
}
