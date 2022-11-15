package com.ttn.SpringSecurity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private TokenStore tokenStore;

    @GetMapping("/doLogout")
    public String logout(HttpServletRequest request){
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
            String tokenValue = authHeader.replace("Bearer", "").trim();
            OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
            tokenStore.removeAccessToken(accessToken);
        }
        return "Logged out successfully";
    }
    @GetMapping("/")
    public String index(){
        return "Home";
    }

    @GetMapping("/admin/home")
    public String adminHome(){
        return "Hello Admin";
    }

    @GetMapping("/user/home")
    public String userHome(){
        return "Hello User";
    }
}
