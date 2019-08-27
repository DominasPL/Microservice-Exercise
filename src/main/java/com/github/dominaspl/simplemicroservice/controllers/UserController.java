package com.github.dominaspl.simplemicroservice.controllers;

import com.github.dominaspl.simplemicroservice.dtos.UserDTO;
import com.github.dominaspl.simplemicroservice.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/list", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> getAllUsers() {

        return userService.findAllUsers();
    }

    @PostMapping(value = "/add", produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public UserDTO addUser(@Valid @RequestBody UserDTO userDTO) {

        return userService.addUser(userDTO);
    }

}
