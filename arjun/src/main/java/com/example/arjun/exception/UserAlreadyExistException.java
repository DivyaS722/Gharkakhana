package com.example.arjun.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String msg) {
        super(msg);
    }
}
