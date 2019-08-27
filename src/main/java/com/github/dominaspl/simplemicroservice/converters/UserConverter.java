package com.github.dominaspl.simplemicroservice.converters;

import com.github.dominaspl.simplemicroservice.dtos.UserDTO;
import com.github.dominaspl.simplemicroservice.models.User;

public class UserConverter {

    public static User ConvertToUser(UserDTO userDTO) {

        User user = new User();
        user.setName(userDTO.getName());
        return user;
    }

}
