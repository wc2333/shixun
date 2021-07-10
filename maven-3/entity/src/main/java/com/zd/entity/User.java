package com.zd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor//无参构造方法
@AllArgsConstructor//全参沟槽方法
@Data
@ToString

public class User {
    private int uid;
    private String username;
    private String password;


}
