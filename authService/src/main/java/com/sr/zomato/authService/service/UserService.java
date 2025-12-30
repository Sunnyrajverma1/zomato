package com.sr.zomato.authService.service;

import com.sr.zomato.authService.dto.UserDto;
import com.sr.zomato.authService.dto.UserLoginDto;
import com.sr.zomato.authService.dto.UserSignupDto;

public interface UserService {
    UserDto signup(UserSignupDto userSignupDto);
    UserDto login(UserLoginDto userLoginDto);
}
