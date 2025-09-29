package com.example.adapter;

import java.util.Random;

public class TemperatureSensor {
    // Returns temperature in Fahrenheit
    public double getTemperatureInFahrenheit() {
        Random random = new Random();
        return 68 + (32 * random.nextDouble()); // random between 68°F and 100°F
    }
}
