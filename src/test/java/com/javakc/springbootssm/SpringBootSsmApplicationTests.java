package com.javakc.springbootssm;

import com.javakc.springbootssm.user.entity.User;
import com.javakc.springbootssm.user.service.UserService;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.Date;

@SpringBootTest
class SpringBootSsmApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() {
        //HikariDataSource springboot 默认数据库连接池管理工具
        System.out.println(dataSource);

//        User user = new User();
//        user.setName("sss");
//        user.setAge(12);
//        user.setBirthday(new Date());
//        user.setAddress("北京市");
//
//        userService.insert(user);


    }

}
