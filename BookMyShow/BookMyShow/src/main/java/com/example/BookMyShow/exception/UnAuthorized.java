package com.example.BookMyShow.exception;

public class UnAuthorized extends RuntimeException{
    public UnAuthorized(String message){
        super(message);
    }
}
