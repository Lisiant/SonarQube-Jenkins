package com.example.sqdemo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private String hardcodedPassword = "P@ssw0rd123";

    public boolean authenticate(String inputPassword) {
        return hardcodedPassword.equals(inputPassword);
    }

}