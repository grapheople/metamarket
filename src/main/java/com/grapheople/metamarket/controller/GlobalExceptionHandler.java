package com.grapheople.metamarket.controller;

import com.grapheople.metamarket.model.helper.WebResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by 지성인 on 2021-12-02.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<WebResponse> handleException(Exception e) {
        WebResponse response = new WebResponse(500, e.getLocalizedMessage(), "-100");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
