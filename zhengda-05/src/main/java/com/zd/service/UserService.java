package com.zd.service;

import com.zd.dao.UserDao;
import com.zd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    //自动装配
    @Autowired

    private UserDao userDao;


    public List<User> queryUsers() {
        List<User> users = userDao.getAllUsers();
        return users;
    }

    public User getUser(){
        return new User(1,"wcg","110");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
