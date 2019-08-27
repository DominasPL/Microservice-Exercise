package com.github.dominaspl.simplemicroservice.services;

import com.github.dominaspl.simplemicroservice.dtos.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO addUser(UserDTO userDTO);

    List<UserDTO> findAllUsers();
}
