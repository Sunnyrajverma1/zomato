package com.sr.zomato.authService.repository;

import com.sr.zomato.authService.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.InterfaceAddress;

public interface RolesRepository extends JpaRepository<Roles, Long> {
}