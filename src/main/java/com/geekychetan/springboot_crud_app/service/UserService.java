package com.geekychetan.springboot_crud_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekychetan.springboot_crud_app.model.User;
import com.geekychetan.springboot_crud_app.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void createUser(User user) {
        userRepository.save(user);
    }
}
