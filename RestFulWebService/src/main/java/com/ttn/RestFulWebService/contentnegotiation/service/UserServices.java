package com.ttn.RestFulWebService.contentnegotiation.service;

import com.ttn.RestFulWebService.contentnegotiation.entity.Users;
import org.apache.catalina.User;

import java.util.List;

interface UserServices {

    public Users createUser(Users user);
    public List<Users> getUsers();

}
