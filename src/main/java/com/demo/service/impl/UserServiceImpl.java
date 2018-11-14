package com.demo.service.impl;

import com.demo.dao.UserJPARepository;
import com.demo.entity.User;
import com.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserJPARepository userJPARepository;

    @Override
    public List<User> findAll() {
        List<User> list = userJPARepository.findAll();
        return list;
    }
}
