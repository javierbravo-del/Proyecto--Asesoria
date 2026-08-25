package com.example.demo.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.usuario.app.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

    void deleteByUsername(String username);

    User findByUsername(String username);

}
