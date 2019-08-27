package com.github.dominaspl.simplemicroservice.services;

import com.github.dominaspl.simplemicroservice.converters.UserConverter;
import com.github.dominaspl.simplemicroservice.dtos.UserDTO;
import com.github.dominaspl.simplemicroservice.models.User;
import com.github.dominaspl.simplemicroservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {

        if (userDTO == null) {
            throw new IllegalArgumentException("User must be given!");
        }

        User user = UserConverter.ConvertToUser(userDTO);
        userRepository.save(user);
        userDTO.setId(user.getId());

        return userDTO;
    }

    @Override
    public List<UserDTO> findAllUsers() {

        List<User> allUsers = userRepository.findAll();

        if (allUsers.isEmpty()) {
            throw new IllegalStateException("Users not found!");
        }

        return UserConverter.ConvertToUserDTOList(allUsers);

    }
}
