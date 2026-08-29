package com.example.demo.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.usuario.app.User;

public interface UserRespository extends JpaRepository<User, Long> {

    void deleteByUsername(String username);

    User findByUsername(String username);

}
