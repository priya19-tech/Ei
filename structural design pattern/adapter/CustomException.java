package com.example.adapter;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
        LoggerUtil.error(message);
    }
}
