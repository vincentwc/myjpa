package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    // @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写
    public List<User> findUserList(){
        List<User> list = userService.findAll();
        return list;
    }
}
