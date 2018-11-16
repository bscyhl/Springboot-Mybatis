package com.example.demo334.controller;


import com.example.demo334.entity.User;
import com.example.demo334.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;

    @RequestMapping("/showSingleUser")
    @ResponseBody
    public User getUserById(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        return user;
    }

    @RequestMapping("/showAllUser")
    @ResponseBody
    public List<User> getAllUsers(HttpServletRequest request){


                int userId = Integer.parseInt(request.getParameter("id"));
//        if (userId){
//
//        }
        List<User> user = userService.getAllUsers();
        return user;
    }
}
