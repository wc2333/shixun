package com.zd.dao;

import com.zd.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDao {
public List<User> getAllUsers(){
    List<User> users= new ArrayList<>();
    users.add(new User(1,"wcg","123"));
    return users;
}
}
