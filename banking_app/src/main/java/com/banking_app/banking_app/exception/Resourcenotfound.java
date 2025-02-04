package com.banking_app.banking_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Resourcenotfound extends RuntimeException{

    private static final long serialVersionUID = 1L;
    public Resourcenotfound(String message){
        super(message);
    }

}
