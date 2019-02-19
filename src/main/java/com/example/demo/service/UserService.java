package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    public User getUser(long id);

    public int add(User user);

    int update(User user);
}
