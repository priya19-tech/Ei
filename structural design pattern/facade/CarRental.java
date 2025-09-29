package com.example.facade;

public class CarRental {
    public void rentCar(String city) {
        LoggerUtil.log("Car rented in " + city);
    }

    public void returnCar(String city) {
        LoggerUtil.log("Car returned in " + city);
    }
}
