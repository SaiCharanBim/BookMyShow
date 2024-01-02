package com.example.BookMyShow.exception;

public class ResourceNotExistException extends RuntimeException{
    public ResourceNotExistException(String message){
        super(message);
    }
}
