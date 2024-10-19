package com.example.sqdemo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private String hardcodedPassword = "P@ssw0rd123";
    private String hardcodedPassword2 = "P@ssw0rd123";

    public boolean authenticate(String inputPassword) {
        return hardcodedPassword.equals(inputPassword);
    }

    public boolean authenticate2(String inputPassword) {
        return hardcodedPassword2.equals(inputPassword);
    }
}