package com.example.demo.usuario.service;

import org.springframework.stereotype.Service;

import com.example.demo.usuario.app.User;
import com.example.demo.usuario.repository.UserRespository;

@Service
public class UserService {

    private final UserRespository userRespository;

    UserService(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    public void createUser(String username, String email, String phoneNumber, Integer age) {
        System.out.println("Se creo el usuario " + username);
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        user.setAge(age);
        userRespository.save(user);
    }

    public void getUsers() {
        System.out.println("Obteniendo usuarios");
        userRespository.findAll();

    }

    public void getUser(String username) {
        System.out.println("Obteniendo usuario");
        userRespository.findByUsername(username);
    }

    public void updateUser(String username) {
        System.out.println("Actualizando usuario");
        User user = userRespository.findByUsername(username);
        if (user != null) {
            userRespository.save(user);
        }

    }

    public void deleteUserByUsername(String username) {
        System.out.println("Eliminando usuario");
        userRespository.deleteByUsername(username);

    }

}
