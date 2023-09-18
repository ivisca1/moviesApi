package com.ismar.jwtspringsecurity.services;

import com.ismar.jwtspringsecurity.dtos.SignupRequest;
import com.ismar.jwtspringsecurity.dtos.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupRequest signupRequest);
}
