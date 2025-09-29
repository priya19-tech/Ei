package com.example.facade;

public class Traveler {
    private String name;

    public Traveler(String name) {
        this.name = name;
    }

    public void bookTrip(TravelFacade facade, String from, String to, int nights) {
        try {
            LoggerUtil.log(name + " is booking a trip from " + from + " to " + to);
            facade.bookTrip(from, to, nights);
        } catch (CustomException e) {
            LoggerUtil.error(name + " could not book trip: " + e.getMessage());
        }
    }

    public void cancelTrip(TravelFacade facade, String from, String to) {
        try {
            LoggerUtil.log(name + " is canceling the trip from " + from + " to " + to);
            facade.cancelTrip(from, to);
        } catch (CustomException e) {
            LoggerUtil.error(name + " could not cancel trip: " + e.getMessage());
        }
    }
}
