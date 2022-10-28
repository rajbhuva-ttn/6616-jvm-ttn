package com.ttn.RestFulWebService.contentnegotiation.controller;

import com.ttn.RestFulWebService.contentnegotiation.entity.Users;
import com.ttn.RestFulWebService.contentnegotiation.service.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserServicesImpl userServices;

    @GetMapping(path = "/users")
    public List<Users> getUsers(){
        return userServices.getUsers();
    }
    @PostMapping(path = "/users/add")
    public Users addNewUser(@RequestBody Users users){
        return userServices.createUser(users);
    }

}
