package com.example.demo.usuario.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.usuario.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public void getUser() {
        System.out.println("Obteniendo usuarios");
        userService.getUsers();
    }

    @PostMapping
    public void createUser(String username, String email, String phoneNumber, Integer age) {
        userService.createUser(username, email, phoneNumber, age);
    }

    @PutMapping
    public void updateUser() {
        System.out.println("Actualizando usuario");
    }

    @DeleteMapping
    public void deleteUser() {
        System.out.println("Eliminando usuario");
    }

}
