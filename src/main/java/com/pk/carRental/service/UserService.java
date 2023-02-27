package com.pk.carRental.service;

import com.pk.carRental.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}

