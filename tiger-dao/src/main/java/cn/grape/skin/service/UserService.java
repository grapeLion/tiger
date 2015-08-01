package cn.grape.skin.service;

import cn.grape.skin.domain.User;
import cn.grape.skin.mapper.UserMapper;

/**
 * Created by Emily on 15/8/1.
 */
public interface UserService {

    User getUserById(Long id);


}
