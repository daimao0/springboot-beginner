package com.example.beginner.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 *  mybaits配置
 * @author 呆毛
 */
@Configuration
@MapperScan({"com.example.beginner.mapper"})
public class MybatisConfig {
}
