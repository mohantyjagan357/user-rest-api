package com.example.demo.Repository;

import com.example.demo.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    ArrayList<User> Db = new ArrayList<>();

    @Override
    public List<User> getUser() {
        return Db;
    }

    @Override
    public User saveUser(User user) {
        for (User currUser : Db) {
            if (user.getId() == currUser.getId()){
                return user;
            }
        }
        Db.add(user);
        return user;
    }
}
