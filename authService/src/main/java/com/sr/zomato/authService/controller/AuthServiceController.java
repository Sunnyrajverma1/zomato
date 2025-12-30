package com.sr.zomato.authService.controller;

import com.sr.zomato.authService.dto.UserDto;
import com.sr.zomato.authService.dto.UserLoginDto;
import com.sr.zomato.authService.dto.UserSignupDto;
import com.sr.zomato.authService.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthServiceController {
   private final UserService userService;

    public AuthServiceController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/test")
    public String test()
    {

        return "Auth Service is up and running!";
    }
   @PostMapping("/signup")
   public UserDto signup(@Valid @RequestBody UserSignupDto userSignupDto){
       return userService.signup(userSignupDto);
   }

    @PostMapping("/login")
    public UserDto login(@Valid @RequestBody UserLoginDto userLoginDto){
        return userService.login(userLoginDto);
    }
}
