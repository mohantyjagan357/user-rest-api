package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

        @Autowired
        UserService userService;
        @GetMapping("/getAllUser")
        public List<User> fetchUser(){

        return userService.getAllUser();
        }

        @PostMapping("/saveUser")
            public User saveUser(@RequestBody User user){
            if (user.getName() == null) return null;

             return userService.saveUser(user);
            }
}
