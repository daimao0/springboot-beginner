package com.example.beginner.service;

import com.example.beginner.common.api.CommonResult;
import com.example.beginner.mapper.UmsUserMapper;
import com.example.beginner.module.UmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 呆毛
 */
@Service
public class UmsUserService {
    @Autowired
    private UmsUserMapper umsUserMapper;

    public CommonResult<UmsUser> insertUmsUserMapper(UmsUser umsUser){
        umsUserMapper.insert(umsUser);
        return CommonResult.success(umsUser);
    }
    public CommonResult<List<UmsUser>> listUmsUsers(){
        List<UmsUser> umsUsers = umsUserMapper.selectList(null);
        return CommonResult.success(umsUsers);
    }
    public CommonResult<UmsUser> getUmsUser(String username){
        UmsUser umsUserCondition = new UmsUser().setUsername(username);
        UmsUser umsUsers = umsUserMapper.selectOne(umsUserCondition);
        return CommonResult.success(umsUsers);
    }
    public CommonResult<UmsUser> updateUmsUser(UmsUser umsUser) {
        UmsUser umsUserCondition = new UmsUser().setUsername(umsUser.getUsername());
        UmsUser user = umsUserMapper.selectOne(umsUserCondition);
        umsUser.setId(user.getId());
        Integer num = umsUserMapper.updateById(umsUser);
        if (num == 1) {
            return CommonResult.success(null, "success");
        }
        return CommonResult.failed("更新失败，请检查用户是否存在");
    }
}
