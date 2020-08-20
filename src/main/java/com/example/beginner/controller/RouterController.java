package com.example.beginner.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 路由控制器
 * @author 呆毛
 */
@Controller
public class RouterController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/error")
    public String error(){
        return "index";
    }
    @GetMapping("/main")
    public String getMain(){
        return "main";
    }
    @GetMapping("/user")
    public String listUser(){
        return "user_list";
    }
    @GetMapping("/user/add")
    public String addUser(){
        return "user_add";
    }
    @GetMapping("/user/update")
    public String updateUser(){
        return "user_update";
    }
}
