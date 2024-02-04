package com.spring.datajpa.controller;

import com.spring.datajpa.entity.User;
import com.spring.datajpa.model.security.AuthRequest;
import com.spring.datajpa.service.UserService;
import com.spring.datajpa.service.impl.UserServiceImpl;
import com.spring.datajpa.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    AuthenticationManager authenticationManager;

    @PostMapping("/addUser")
    public List<User> addUser(@RequestBody List<User> user){
        return userServiceImpl.addUser(user);
    }

    @GetMapping("/")
    public String welcome(){return "Welcome";}

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {

        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );
            if(authentication.isAuthenticated()){
                return jwtUtil.generateToken(authRequest.getUsername());
            }

        }catch (Exception e){
            throw new Exception("invalid username and password");
        }


       return "Invalid Creds";
    }
}
