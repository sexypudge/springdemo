package com.example.demo.model.payload;

public abstract class BaseResponse {

    private boolean success = true;

    private String errorCode;

    private Object message = "success";

    private String additionalInfo = "";

    public BaseResponse(boolean success, String errorCode, Object message, String additionalInfo) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
        this.additionalInfo = additionalInfo;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
