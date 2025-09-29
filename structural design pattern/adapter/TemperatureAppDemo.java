package com.example.adapter;

import java.util.Scanner;

public class TemperatureAppDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();
            SmartHomeUser user = new SmartHomeUser(userName);

            TemperatureSensor sensor = new TemperatureSensor();
            TemperatureProvider adapter = new FahrenheitToCelsiusAdapter(sensor);

            boolean running = true;
            while (running) {
                System.out.println("\nOptions:\n1. Read Temperature\n2. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        user.checkTemperature(adapter);
                        break;
                    case 2:
                        running = false;
                        LoggerUtil.log("Exiting Temperature App...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            LoggerUtil.error("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
            LoggerUtil.log("Temperature App terminated safely.");
        }
    }
}
