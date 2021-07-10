package com.zd.controller;

import com.zd.entity.User;
import com.zd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
@Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(User user) {
        System.out.println(user);
        return "userInfo";
    }

    //@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    //@ResponseBody
    public String get(@PathVariable("id") Integer uid, Model model) {
        User user = userService.getUser(uid);
        model.addAttribute("user", user);
        return "userInfo";
    }

    @PostMapping("/user/{id}")
    public String post(@PathVariable("id") Integer uid) {
        System.out.println(uid);
        return "userInfo";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer uid) {
        System.out.println(uid);
        return "userInfo";
    }

    @PutMapping("/user/{id}")
    public String put(@PathVariable("id") Integer uid) {
        System.out.println(uid);
        return "userInfo";
    }

}
