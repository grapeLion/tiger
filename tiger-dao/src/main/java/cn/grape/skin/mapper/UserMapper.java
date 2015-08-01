package cn.grape.skin.mapper;

import cn.grape.skin.domain.User;

/**
 * Created by Emily on 15/8/1.
 */
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
