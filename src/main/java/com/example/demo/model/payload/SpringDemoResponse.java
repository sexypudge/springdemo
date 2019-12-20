package com.example.demo.model.payload;


public class SpringDemoResponse extends ErrorResponse{

    public SpringDemoResponse(String errorCode, Object message, String additionalInfo) {
        super(errorCode, "Spring - demo - exception", additionalInfo);
    }
}
