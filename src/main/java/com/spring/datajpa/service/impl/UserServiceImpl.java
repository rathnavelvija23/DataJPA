package com.spring.datajpa.service.impl;

import com.spring.datajpa.entity.User;
import com.spring.datajpa.repository.UserRepository;
import com.spring.datajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> addUser(List<User> userList) {
        for(User user:userList) {
            userRepository.save(user);
        }
        return userRepository.findAll();
    }
}
