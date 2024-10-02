package com.br.zup.validateions.controllers;

import com.br.zup.validateions.controllers.dtos.UserDTO;
import com.br.zup.validateions.controllers.dtos.UserRegisterDTO;
import com.br.zup.validateions.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/registro")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO registerUser(@RequestBody UserRegisterDTO user){
        return userService.save(user);
    }

    @PostMapping ("/validateUser")
    public ResponseEntity<UserDTO> validateUser(@Valid @RequestBody UserRegisterDTO userRegisterDTO, BindingResult result) {
        Map<String, String> errors = userService.validateUser(userRegisterDTO, result);

        if(!errors.isEmpty()){
           return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(errors);
        }
        return ResponseEntity.ok(Map.of("message", "Sucesso!"));
    }
}
