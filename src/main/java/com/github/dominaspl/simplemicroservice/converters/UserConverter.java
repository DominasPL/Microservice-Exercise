package com.github.dominaspl.simplemicroservice.converters;

import com.github.dominaspl.simplemicroservice.dtos.UserDTO;
import com.github.dominaspl.simplemicroservice.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static User ConvertToUser(UserDTO userDTO) {

        User user = new User();
        user.setName(userDTO.getName());
        return user;
    }

    public static List<UserDTO> ConvertToUserDTOList(List<User> allUsers) {

        List<UserDTO> userDTOList = new ArrayList<>();

        for (User user : allUsers) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTOList.add(userDTO);
        }

        return userDTOList;
    }
}
