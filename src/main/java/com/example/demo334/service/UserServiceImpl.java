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
        UserExample.Criteria criteria;
        criteria = example.createCriteria();
        criteria.andIdEqualTo(userId);
        List<User> resultUserList=userMapper.selectByExample(example);
        return resultUserList.get(0);
    }

    @Override
    public List<User> getAllUsers() {

        UserExample example = new UserExample();
        List<User> resultUserList=userMapper.selectByExample(example);

        if (resultUserList.isEmpty()){
            return null;
        }
        else {
            return resultUserList;
        }
    }


}
