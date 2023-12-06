package com.paranie.usercrudoperation.service;

import com.paranie.usercrudoperation.dto.UserDTO;
import com.paranie.usercrudoperation.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();

    User getUser(Integer id);

    void deleteUser(Integer id);

    void updateUser(Integer id, User user);

    void updateName(Integer id, UserDTO userDTO);
}
