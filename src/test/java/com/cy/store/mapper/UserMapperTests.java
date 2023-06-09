package com.cy.store.mapper;
import com.cy.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void insert() {
        User user = new User();
        user.setUsername("user04");
        user.setPassword("123456");
        Integer rows = userMapper.insert(user);
        System.out.println("rows=" + rows);
        System.out.println("新加一行代码");
    }

    @Test
    public void findByUsername() {
        String username = "lower";
        User result = userMapper.findByUsername(username);
        System.out.println(result);
    }
}
