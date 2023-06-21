package com.hcc.controllers;

import com.hcc.entities.User;
import com.hcc.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
/*
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<?> findUserById(Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        return ResponseEntity.ok(userOpt.orElse(new User()));
    }

    @GetMapping
    public ResponseEntity<?> findByUsername(String username) {
        return null;
    }


}

 */
