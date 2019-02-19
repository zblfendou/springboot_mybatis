package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUser(long id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public Long add(User user) {
        userDao.insert(user);
        return user.getId();
    }

    @Override
    public int update(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }
}
