public class bikeride implements ride {
    private double ratePerKm = 5.0;

    @Override
    public void bookRide(String pickup, String drop) {
        System.out.println("Bike ride booked from " + pickup + " to " + drop);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public void rideInfo() {
        System.out.println("Bike Ride: Affordable, max 1 passenger.");
    }
}
