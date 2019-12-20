package com.example.demo.exception;

import com.example.demo.model.payload.ErrorResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class RestExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        List<ObjectError> errors = bindingResult.getAllErrors();
        Map<String, String> errorsMap = new HashMap<>();
        errors.forEach(err -> {
            FieldError fieldError = (FieldError) err;
            errorsMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        LOGGER.error("MethodArgumentNotValidException: "+ ex.getClass().getName() + " " + ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.BAD_REQUEST.toString(), errorsMap, ""), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({SpringDemoException.class})
    public ResponseEntity<ErrorResponse> handleSpringDemoException(
            SpringDemoException ex) {
        ex.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.toString(), ex.getMessage(), ""), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
