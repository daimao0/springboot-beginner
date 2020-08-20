package com.example.beginner.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.beginner.module.UmsUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 呆毛
 */
@Mapper
public interface UmsUserMapper extends BaseMapper<UmsUser> {
}
