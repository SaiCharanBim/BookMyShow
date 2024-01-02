package com.example.BookMyShow.exception;

public class UserDoesNotExistException extends RuntimeException{
    public UserDoesNotExistException(String message){
        super(message);
    }
}
