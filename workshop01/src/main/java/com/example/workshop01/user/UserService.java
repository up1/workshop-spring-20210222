package com.example.workshop01.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse findById(int id) {
        UserResponse userResponse = new UserResponse(id, "somkiat", 40);
        return userResponse;
    }
}
