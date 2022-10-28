package com.ttn.RestFulWebService.hateoas.service;

import com.ttn.RestFulWebService.hateoas.entity.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UsersServiceImpl implements UsersService{

    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("Raj","raj@gmail.com",1001));
        userList.add(new User("Vaibhav", "vaibhav@gmail.com", 1002));
        userList.add(new User("Mohit", "mohit@gmail.com",1003));
    }


    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    public User findUserById(int userId){
        Predicate<? super User> predicate = user -> user.getUserId() == userId;
        User user = userList.stream().filter(predicate).findFirst().get();
        return user;
    }
}
