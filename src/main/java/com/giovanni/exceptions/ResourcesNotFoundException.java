package com.giovanni.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class ResourcesNotFoundException extends RuntimeException{

    private String message;

    public ResourcesNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
