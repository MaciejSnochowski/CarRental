package com.pk.carRental.service;

import com.pk.carRental.model.User;
import com.pk.carRental.repository.UserRepository;


import java.util.List;


public class UserServiceImpl  implements  UserService{

    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
