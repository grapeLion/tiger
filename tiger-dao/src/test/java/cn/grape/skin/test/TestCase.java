package cn.grape.skin.test;

import cn.grape.skin.domain.User;
import cn.grape.skin.mapper.UserMapper;
import cn.grape.skin.service.UserService;
import cn.grape.skin.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Emily on 15/8/1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"})
public class TestCase {

    @Autowired
    UserService userService;
    @Test
    public void testUser(){
        User user = userService.getUserById(1l);
        System.out.println(user);
    }


}
