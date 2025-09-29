package com.example.adapter;

public interface TemperatureProvider {
    double getTemperatureInCelsius() throws CustomException;
}
