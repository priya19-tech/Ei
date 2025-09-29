package com.example.facade;

public class FlightBooking {
    public void bookFlight(String from, String to) {
        LoggerUtil.log("Flight booked from " + from + " to " + to);
    }

    public void cancelFlight(String from, String to) {
        LoggerUtil.log("Flight canceled from " + from + " to " + to);
    }
}
