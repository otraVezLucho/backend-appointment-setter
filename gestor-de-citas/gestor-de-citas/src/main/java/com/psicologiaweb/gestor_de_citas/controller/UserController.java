package com.psicologiaweb.gestor_de_citas.controller;

import com.psicologiaweb.gestor_de_citas.model.User;
import com.psicologiaweb.gestor_de_citas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    //sigo en el metodo saveUser, necesito trabajar en el manejo del error 500 cuando el usuario ya esta registrado
    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User userCreated = userService.save(user);
        URI location = URI.create("/api/users/" + userCreated.getId());
        return ResponseEntity.created(location).body(userCreated);
    }


}
