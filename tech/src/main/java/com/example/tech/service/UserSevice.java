package com.example.tech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tech.domain.User;
import com.example.tech.repository.UserRepository;

@Service
public class UserSevice {
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        User techUser = this.userRepository.save(user);
        System.out.println(techUser);
        return techUser;
    }
}
