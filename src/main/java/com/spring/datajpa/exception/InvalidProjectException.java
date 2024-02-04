package com.spring.datajpa.exception;

public class InvalidProjectException extends RuntimeException{

    public InvalidProjectException(String msg){
        super(msg);
    }
}
