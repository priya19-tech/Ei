public class sharedride implements ride {
    private double ratePerKm = 7.0;

    @Override
    public void bookRide(String pickup, String drop) {
        System.out.println("Shared ride booked from " + pickup + " to " + drop);
    }

    @Override
    public double calculateFare(double distance) {
        // Shared is cheaper (50% discount)
        return (distance * ratePerKm) * 0.5;
    }

    @Override
    public void rideInfo() {
        System.out.println("Shared Ride: Budget-friendly, ride with others.");
    }
}
