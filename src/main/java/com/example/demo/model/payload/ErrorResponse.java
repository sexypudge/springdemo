package com.example.demo.model.payload;

public class ErrorResponse extends BaseResponse{

    public ErrorResponse(String errorCode, Object message, String additionalInfo) {
        super(false, errorCode, message, additionalInfo);
    }
}
