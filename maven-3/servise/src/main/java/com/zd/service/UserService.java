package com.zd.service;

import com.zd.dao.UserDao;
import com.zd.entity.User;

import java.util.List;

public class UserService {
    public List<User> getAllUsers(){
        UserDao userdao=new UserDao();
        return userdao.queryAllUsers();
    }
}
