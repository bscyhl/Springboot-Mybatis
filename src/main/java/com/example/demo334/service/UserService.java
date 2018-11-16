package com.example.demo334.service;

import com.example.demo334.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(int userId);
    public List<User> getAllUsers();
}
