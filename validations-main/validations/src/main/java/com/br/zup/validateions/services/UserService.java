package com.br.zup.validateions.services;

import com.br.zup.validateions.controllers.dtos.UserDTO;
import com.br.zup.validateions.controllers.dtos.UserRegisterDTO;
import com.br.zup.validateions.services.mappers.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);


    public UserDTO save(UserRegisterDTO userRegisterDTO){
        log.info("Registou");
        UserDTO userDTO =  UserMapper.toUserDTO(userRegisterDTO);
        userDTO.setId(UUID.randomUUID());
        return userDTO;
    }
}
