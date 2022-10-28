package com.ttn.RestFulWebService.hateoas.service;

import com.ttn.RestFulWebService.hateoas.entity.User;

import java.util.List;

public interface UsersService {
    public List<User> getAllUsers();
    public User findUserById(int userId);
}
