package com.kenobi.cafe.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils(){

    }
    public static ResponseEntity<String> getResponseEntity(String response, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\"" + response + "\"}", httpStatus);
    }
}
