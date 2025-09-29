package com.example.facade;

import java.util.Scanner;

public class TravelAppDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String userName = scanner.nextLine();
            Traveler traveler = new Traveler(userName);

            FlightBooking flightBooking = new FlightBooking();
            HotelBooking hotelBooking = new HotelBooking();
            CarRental carRental = new CarRental();

            TravelFacade facade = new TravelFacade(flightBooking, hotelBooking, carRental);

            boolean running = true;
            while (running) {
                System.out.println("\nOptions:\n1. Book Trip\n2. Cancel Trip\n3. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter source city: ");
                        String from = scanner.nextLine();
                        System.out.print("Enter destination city: ");
                        String to = scanner.nextLine();
                        System.out.print("Enter number of nights: ");
                        int nights = scanner.nextInt();
                        traveler.bookTrip(facade, from, to, nights);
                    }
                    case 2 -> {
                        System.out.print("Enter source city: ");
                        String from = scanner.nextLine();
                        System.out.print("Enter destination city: ");
                        String to = scanner.nextLine();
                        traveler.cancelTrip(facade, from, to);
                    }
                    case 3 -> {
                        running = false;
                        LoggerUtil.log("Exiting Travel App...");
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            LoggerUtil.error("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
            LoggerUtil.log("Travel App terminated safely.");
        }
    }
}
