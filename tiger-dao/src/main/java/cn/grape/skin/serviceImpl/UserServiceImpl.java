package cn.grape.skin.serviceImpl;

import cn.grape.skin.domain.User;
import cn.grape.skin.mapper.UserMapper;
import cn.grape.skin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Emily on 15/8/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public User getUserById(Long id) {

        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
