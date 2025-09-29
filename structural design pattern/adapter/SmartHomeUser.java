package com.example.adapter;

public class SmartHomeUser {
    private final String name;

    public SmartHomeUser(String name) {
        this.name = name;
    }

    public void checkTemperature(TemperatureProvider provider) {
        try {
            double tempC = provider.getTemperatureInCelsius();
            LoggerUtil.log(name + " sees the room temperature as " + String.format("%.2f°C", tempC));
        } catch (CustomException e) {
            LoggerUtil.error(name + " could not read temperature: " + e.getMessage());
        }
    }
}
