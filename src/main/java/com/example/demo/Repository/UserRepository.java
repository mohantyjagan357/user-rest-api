package com.example.demo.Repository;

import com.example.demo.Model.User;

import java.util.List;

public interface UserRepository {
    public List<User> getUser();

    public  User saveUser(User user);

}
