package com.ttn.RestFulWebService.contentnegotiation.service;

import com.ttn.RestFulWebService.contentnegotiation.entity.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices {


    private static List<Users> usersList = new ArrayList<>();
    static {
        usersList.add(new Users("Raj"));
        usersList.add(new Users("Sahil"));
        usersList.add(new Users("Rakesh"));
    }
    public Users createUser(Users user){
        usersList.add(user);
        return user;
    }

    @Override
    public List<Users> getUsers() {

        return usersList;
    }
}