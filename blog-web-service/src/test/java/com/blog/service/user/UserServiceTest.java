package com.blog.service.user;


import com.blog.service.UserService;
import com.bolg.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : UserServiceTest
 * @Description:
 * @date : 2022/1/5 11:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {


    @Autowired
    private UserService userService;

    @Test
    public void testUserService() {
        User byId = userService.getById(111);
        System.out.println("byId = " + byId);
    }

}