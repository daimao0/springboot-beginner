package com.example.beginner;

import com.example.beginner.mapper.UmsUserMapper;
import com.example.beginner.module.UmsUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class BeginnerApplicationTests {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UmsUserMapper umsUserMapper;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getConnection());
        UmsUser umsUser = new UmsUser()
                .setUsername("admin")
                .setPassword("123456")
                .setEmail("123@qq,com")
                .setPhone("12341234123")
                .setNickname("呆毛")
                .setRole("vip5");
        Integer i = umsUserMapper.insert(umsUser);
        System.out.println(i);
    }

}
