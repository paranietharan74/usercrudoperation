package com.paranie.usercrudoperation.repository;

import com.paranie.usercrudoperation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
