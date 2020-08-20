package com.example.beginner.controller;

import com.example.beginner.common.api.CommonResult;
import com.example.beginner.module.UmsUser;
import com.example.beginner.service.UmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 呆毛
 */
@RestController()
@RequestMapping("/user")
public class UmsUserController {
    @Autowired
    private UmsUserService umsUserService;

    @PostMapping("/add")
    public CommonResult<UmsUser> insertUmsUser(@RequestBody UmsUser umsUser){
        return umsUserService.insertUmsUserMapper(umsUser);
    }
    @GetMapping("/list")
    public CommonResult<List<UmsUser>>  listUmsUsers(){
        return umsUserService.listUmsUsers();
    }

    @PostMapping("/getUser")
    public CommonResult<UmsUser>  getUmsUser(String username){
        return umsUserService.getUmsUser(username);
    }

    @PostMapping("/update")
    public CommonResult<UmsUser>  updateUmsUser(@RequestBody UmsUser umsUser){
        return umsUserService.updateUmsUser(umsUser);
    }
}
