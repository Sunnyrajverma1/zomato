package com.sr.zomato.authService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.sr.zomato.authService.entity.RoleType;

import java.util.Set;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userName;

    private String email;

    private String firstName;

    private String middleName;

    private String lastName;

    private String mobileNumber;

    private Set<RoleType> roles;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
