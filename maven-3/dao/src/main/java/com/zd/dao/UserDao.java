package com.zd.dao;

import com.zd.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> queryAllUsers(){
//模拟查询数据库
        List<User> users=new ArrayList<>();
        users.add(new User(1,"wc","110"));
        return users;
    }
}
