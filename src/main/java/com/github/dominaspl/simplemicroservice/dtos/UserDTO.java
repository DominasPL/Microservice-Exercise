package com.github.dominaspl.simplemicroservice.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@RequiredArgsConstructor
public class UserDTO {

    private Long id;

    @NotEmpty(message = "Name can't be empty!")
    private String name;
}
