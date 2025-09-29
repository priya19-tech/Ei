package com.example.adapter;

public class FahrenheitToCelsiusAdapter implements TemperatureProvider {
    private final TemperatureSensor sensor;

    public FahrenheitToCelsiusAdapter(TemperatureSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureInCelsius() throws CustomException {
        double fahrenheit = sensor.getTemperatureInFahrenheit();
        if (fahrenheit < -459.67) { // absolute zero check
            throw new CustomException("Invalid temperature reading!");
        }
        double celsius = (fahrenheit - 32) * 5 / 9;
        LoggerUtil.log(String.format("Converted %.2f°F to %.2f°C", fahrenheit, celsius));
        return celsius;
    }
}
