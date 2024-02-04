package com.spring.datajpa.service;

import com.spring.datajpa.entity.User;

import java.util.List;

public interface UserService {

    List<User> addUser(List<User> userList);
}
