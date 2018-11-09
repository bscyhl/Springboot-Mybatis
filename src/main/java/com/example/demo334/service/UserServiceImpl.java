package com.example.demo334.service;


import com.example.demo334.dao.UserMapper;
import com.example.demo334.entity.User;
import com.example.demo334.entity.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserById(int userId) {

        UserExample example = new UserExample();
        example.createCriteria();
        List<User> resultUserList=userMapper.selectByExample(example);
        return resultUserList.get(0);
    }


}
