package com.example.arjun.exception;

public class IdAlreadyExistException extends RuntimeException{
	public IdAlreadyExistException(String msg) {
        super(msg);
    }
}
