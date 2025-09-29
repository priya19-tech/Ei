package com.example.facade;

import java.time.LocalDateTime;

public class LoggerUtil {
    public static void log(String message) {
        System.out.println("[LOG " + LocalDateTime.now() + "] " + message);
    }

    public static void error(String message) {
        System.err.println("[ERROR " + LocalDateTime.now() + "] " + message);
    }
}
