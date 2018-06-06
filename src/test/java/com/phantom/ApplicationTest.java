package com.phantom;

import com.phantom.domain.User;
import com.phantom.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    UserService userService;

    @Before
    public void setUp() throws Exception {
        /**
         * 准备！清空user表
         */
        userService.deleteAllUsers();
    }

    @Test
    public void testUserService() {

        /* 准备用户表数据 */
        userService.create("张三", (int) (Math.random() * 100), 1L);
        userService.create("李四", (int) (Math.random() * 100), 2L);
        userService.create("王五", (int) (Math.random() * 100), 3L);
        userService.create("赵六", (int) (Math.random() * 100), 4L);

        Assert.assertEquals(4, userService.getAllUsersAcount().intValue());

        /* 删除一个李四 */
        userService.deleteByName("李四");


        /* 获取全部用户 */
        List<User> userList = userService.getAllUsers();


        Assert.assertEquals(3, userService.getAllUsersAcount().intValue());

        /* 清零 */
        userService.deleteAllUsers();


        Assert.assertEquals(0, userService.getAllUsersAcount().intValue());


    }
}