package com.example.facade;

public class HotelBooking {
    public void bookHotel(String city, int nights) {
        LoggerUtil.log("Hotel booked in " + city + " for " + nights + " nights");
    }

    public void cancelHotel(String city) {
        LoggerUtil.log("Hotel booking canceled in " + city);
    }
}
