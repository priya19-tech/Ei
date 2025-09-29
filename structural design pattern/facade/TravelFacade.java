package com.example.facade;

public class TravelFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public TravelFacade(FlightBooking flightBooking, HotelBooking hotelBooking, CarRental carRental) {
        this.flightBooking = flightBooking;
        this.hotelBooking = hotelBooking;
        this.carRental = carRental;
    }

    public void bookTrip(String from, String to, int nights) throws CustomException {
        if (from == null || to == null || nights <= 0)
            throw new CustomException("Invalid trip details!");
        LoggerUtil.log("Starting trip booking...");
        flightBooking.bookFlight(from, to);
        hotelBooking.bookHotel(to, nights);
        carRental.rentCar(to);
        LoggerUtil.log("Trip booked successfully!");
    }

    public void cancelTrip(String from, String to) throws CustomException {
        if (from == null || to == null)
            throw new CustomException("Invalid trip details!");
        LoggerUtil.log("Canceling trip...");
        flightBooking.cancelFlight(from, to);
        hotelBooking.cancelHotel(to);
        carRental.returnCar(to);
        LoggerUtil.log("Trip canceled successfully!");
    }
}
