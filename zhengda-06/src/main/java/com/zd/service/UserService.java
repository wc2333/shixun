package com.zd.service;

import com.zd.dao.UserDao;
import com.zd.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    private UserDao userDao;

    public User getUser(int uid) {
        User user=userDao.getUser(uid);
       return user;
        // return userDao.getUser(uid);
    }
}

