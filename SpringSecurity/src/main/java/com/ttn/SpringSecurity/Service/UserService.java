package com.ttn.SpringSecurity.Service;

import com.ttn.SpringSecurity.Config.AppUser;
import com.ttn.SpringSecurity.Config.GrantAuthorityImpl;
import com.ttn.SpringSecurity.Repository.UserRepository;
import com.ttn.SpringSecurity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if (username != null) {
            return new AppUser(user.getUsername(), user.getPassword(), Arrays.asList(new GrantAuthorityImpl(user.getRole())));
        } else {
            throw new RuntimeException();
        }

    }
}