package com.example.mylocapi.Service;

import com.example.mylocapi.Model.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);
}
