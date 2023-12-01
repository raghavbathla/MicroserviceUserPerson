package com.user.user_service.dto;

public class ResponseDto {

    private String message;
    private Object data;

    public ResponseDto(String message, Object object) {
        this.message = message;
        this.data = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object object) {
        this.data = object;
    }

    public ResponseDto() {
    }
}
