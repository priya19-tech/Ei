public class carride implements ride {
    private double ratePerKm = 12.0;

    @Override
    public void bookRide(String pickup, String drop) {
        System.out.println("Car ride booked from " + pickup + " to " + drop);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public void rideInfo() {
        System.out.println("Car Ride: Comfortable, max 4 passengers.");
    }
}
