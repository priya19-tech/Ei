package com.example.facade;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
        LoggerUtil.error(message);
    }
}
