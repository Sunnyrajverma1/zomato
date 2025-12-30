package com.sr.zomato.authService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignupDto {

    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 20, message = "username must be between 5 and 20 characters")
    @Pattern(
            regexp = "^(?=.*[a-zA-Z])[a-zA-Z0-9._]+$",
            message = "username must have one character"
    )
    private String userName;

    @NotBlank(message = "password is required")
    @Size(min = 8, max = 16, message = "Password must be between 8 and 16 characters")
    private String password;

    @Email(message = "invalid email format")
    @NotBlank(message = "email is required")
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "email must contain a valid domain (e.g. gmail.com)"
    )
    private String email;

    @NotBlank(message = "firstname is required")
    private String firstName;

    private String middleName;

    private String lastName;

    @NotBlank(message = "mobile number is required")
    @Pattern(
            regexp = "^\\+[1-9]\\d{1,14}$",
            message = "Mobile Number must include Country Code (e.g. +919876543210)"
    )
    private String mobileNumber;


}
