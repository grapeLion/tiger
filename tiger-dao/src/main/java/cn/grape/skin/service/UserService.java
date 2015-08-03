package cn.grape.skin.service;

import cn.grape.skin.domain.User;
import cn.grape.skin.mapper.UserMapper;

import java.util.List;

/**
 * Created by Emily on 15/8/1.
 */
public interface UserService {

    User getUserById(Long id);

    List<User> findAll();

}
