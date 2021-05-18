package com.dev.datedemo.controller;

import com.dev.datedemo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user/add")
    public User addUser(@RequestBody User user){
        return user;
    }

}
