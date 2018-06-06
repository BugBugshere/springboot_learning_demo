package com.phantom;

import com.phantom.domain.User;
import com.phantom.domain.UserRepository;
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
public class ApplicationJpaTest {

    @Autowired
    UserRepository userRepository;


    @Test
    public void testUserService() {

        // 创建10条记录
        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));
        userRepository.save(new User("CCC", 30));
        userRepository.save(new User("DDD", 40));
        userRepository.save(new User("EEE", 50));
        userRepository.save(new User("FFF", 60));
        userRepository.save(new User("GGG", 70));
        userRepository.save(new User("HHH", 80));
        userRepository.save(new User("III", 90));
        userRepository.save(new User("JJJ", 100));


        Assert.assertEquals(10, userRepository.findAll().size());


        /* 查找一个用户 */
        Assert.assertEquals(50,userRepository.findUser("EEE").getAge().intValue());

        /* 查找FFF与年龄为60的用户 */
        Assert.assertEquals("FFF",userRepository.findByNameAndAge("FFF",60).getName());


        /* 获取全部用户 */
        List<User> userList = userRepository.findAll();


        Assert.assertEquals(10,userList.size());

        /* 测试删除姓名为AAA的User */
        userRepository.delete(userRepository.findByName("AAA"));

        /* 测试findAll, 查询所有记录, 验证上面的删除是否成功 */
        Assert.assertEquals(9, userRepository.findAll().size());


        /* 清零 */
//        userRepository.deleteAll();
//
//
//        Assert.assertEquals(0, userRepository.findAll().size());


    }
}