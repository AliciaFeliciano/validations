package com.br.zup.validateions.services.mappers;

import com.br.zup.validateions.controllers.dtos.UserDTO;
import com.br.zup.validateions.controllers.dtos.UserRegisterDTO;

public class UserMapper {

    public static UserDTO toUserDTO(UserRegisterDTO userRegisterDTO){
        return new UserDTO(
                userRegisterDTO.getName(),
                userRegisterDTO.getAge(),
                userRegisterDTO.getYearOfBirth(),
                userRegisterDTO.getEmail()
                );
    }
}
