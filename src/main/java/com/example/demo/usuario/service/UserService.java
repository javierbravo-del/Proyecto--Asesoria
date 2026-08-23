package com.example.demo.usuario.service;

import org.springframework.stereotype.Service;

import com.example.demo.usuario.app.User;

@Service
public class UserService {

    void crearUser(User user) {
        System.out.println("Se creo el usuario " + user.getUsername());
    }

    void deleteUserByUsername(String username) {

    }

    void updateUserByUsername(String username) {

    }

}
