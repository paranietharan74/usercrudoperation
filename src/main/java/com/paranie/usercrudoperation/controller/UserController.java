package com.paranie.usercrudoperation.controller;

import com.paranie.usercrudoperation.dto.UserDTO;
import com.paranie.usercrudoperation.entity.User;
import com.paranie.usercrudoperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    // Add new user in the database
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.addUser(user);

        return "successfully user added";
    }

    // Get all users
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // Get user by id
    @GetMapping("/get")
    public User getUser(@RequestParam Integer id){
        return  userService.getUser(id);
    }

    // Delete user by id
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }

    // Update User
    @PutMapping("/update/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Integer id, @RequestBody User user) {
        userService.updateUser(id, user);

        return ResponseEntity.noContent().build();
    }

    // Update only the name
    @PatchMapping("/update-name/{id}")
    public ResponseEntity<Void> updateName(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        userService.updateName(id, userDTO);

        return ResponseEntity.noContent().build();
    }
}
