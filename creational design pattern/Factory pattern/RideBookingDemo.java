import java.util.Scanner;

public class RideBookingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RideFactory factory = new RideFactory();

        System.out.println("Welcome to Ride Booking System!");

        // Ask user for ride type, pickup, drop, and distance
        System.out.print("Enter ride type (bike/car/luxury/shared): ");
        String rideType = sc.nextLine();

        System.out.print("Enter pickup location: ");
        String pickup = sc.nextLine();

        System.out.print("Enter drop location: ");
        String drop = sc.nextLine();

        System.out.print("Enter distance (in km): ");
        double distance = sc.nextDouble();

        try {
            // Create ride using factory based on user inputo
            ride ride = factory.createRide(rideType);
            ride.bookRide(pickup, drop);
            ride.rideInfo();
            System.out.println("Fare: ₹" + ride.calculateFare(distance));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
