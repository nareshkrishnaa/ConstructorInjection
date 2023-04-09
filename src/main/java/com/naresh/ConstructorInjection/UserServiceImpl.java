package com.naresh.ConstructorInjection;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final String message;

    public UserServiceImpl(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
