package com.github.dominaspl.simplemicroservice.controllers;

import com.github.dominaspl.simplemicroservice.dtos.UserDTO;
import com.github.dominaspl.simplemicroservice.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping
//    public List<UserDTO> getAllUsers() {
//
//
//
//    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO addUser(@Valid @RequestBody UserDTO userDTO) {

        return userService.addUser(userDTO);
    }

}
