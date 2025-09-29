Travel Booking Application:

This is a simple console-based travel booking application written in Java. It demonstrates the Facade design pattern by providing a simplified interface to a complex system of flight, hotel, and car rental bookings.

Project Structure:

The project is organized into several classes, each with a specific responsibility:

TravelAppDemo.java: The main class that runs the application. It creates instances of the subsystem classes and the TravelFacade, then presents a user-friendly menu to book or cancel trips.

Traveler.java: Represents a user of the application. It contains methods to book and cancel trips, using the TravelFacade to perform these actions.

TravelFacade.java: The core of the Facade pattern implementation. It orchestrates the booking and cancellation of trips by calling the appropriate methods on the FlightBooking, HotelBooking, and CarRental classes. It also includes basic validation for trip details.

FlightBooking.java: A subsystem class responsible for handling flight-related operations like booking and cancellation.

HotelBooking.java: A subsystem class responsible for handling hotel-related operations.

CarRental.java: A subsystem class responsible for handling car rental operations.

CustomException.java: A custom exception class used for handling invalid trip details.

LoggerUtil.java: A utility class for logging messages to the console with timestamps, separating standard logs from error messages.


Use of facade pattern:

The core of the Facade pattern in this application is the TravelFacade.java class. It acts as a single, unified interface for the client, which is the Traveler class. Instead of the Traveler class directly interacting with multiple subsystem components—FlightBooking, HotelBooking, and CarRental—it interacts only with the TravelFacade.

How It Works
Subsystem Components: The FlightBooking, HotelBooking, and CarRental classes are the complex subsystem. Each of these classes has specific, granular responsibilities, such as booking a flight, booking a hotel, or renting a car.

The Facade: The TravelFacade class contains instances of all these subsystem components. It exposes high-level methods like bookTrip() and cancelTrip().

Simplified Client Interaction: The Traveler class (the client) only needs to call facade.bookTrip() or facade.cancelTrip(). The facade then handles the complex sequence of calls to the underlying subsystem components to complete the task. For example, the bookTrip() method in TravelFacade calls flightBooking.bookFlight(), hotelBooking.bookHotel(), and carRental.rentCar() in the correct order. This simplifies the client's code and reduces its dependency on the individual subsystem classes.

The TravelAppDemo.java file demonstrates this interaction by creating an instance of the TravelFacade and passing it to the Traveler object, which then uses it to perform its actions.
