Ride Booking System - Factory Pattern 
This is a simple command-line based ride-booking application written in Java. The project's main purpose is to demonstrate a practical application of the Factory Design Pattern. It allows a user to book different types of rides, and the system creates the appropriate ride object without exposing the creation logic to the main application.

Features:
1.Book various types of rides: Bike, Car, Luxury, and Shared.

2.Calculate the total fare based on the distance and the specific rate of the chosen ride type.

3.Display brief information about the selected ride service.

4.Cleanly structured and easily extensible to include new ride types in the future.

Design Pattern Used: Factory Pattern
This project uses the Factory Design Pattern to manage the creation of ride objects.

ride (Interface): Defines a common interface for all concrete ride classes. This ensures that any object created by the factory will have the same set of methods (bookRide, calculateFare, rideInfo).

bikeride, carride, etc. (Concrete Classes): These are the specific implementations of the ride interface. Each has its own logic, such as a unique ratePerKm.

RideFactory (Factory Class): This class contains the logic for creating and returning the appropriate ride object based on a string input ("bike", "car", etc.). It hides the instantiation logic from the client.

RideBookingDemo (Client): The client code that needs a ride object. It requests an object from the RideFactory instead of creating it directly (e.g., using new carride()).

This pattern decouples the client (RideBookingDemo) from the concrete ride classes, making the system more flexible and easier to maintain. To add a new ride type, you would only need to create a new class implementing the ride interface and update the RideFactory—no changes would be needed in the client code.

Code Components
RideBookingDemo.java: The main application entry point. It handles user input and orchestrates the booking process.

RideFactory.java: The factory class responsible for creating ride objects.

ride.java: The public interface that all ride types must implement.

bikeride.java: The concrete implementation for a bike ride.

carride.java: The concrete implementation for a standard car ride.

luxuryride.java: The concrete implementation for a luxury ride.

sharedride.java: The concrete implementation for a shared ride, which includes a fare discount.

 Run:
 Save all the provided .java files in a single directory
 javac *.java
 java RideBookingDemo


