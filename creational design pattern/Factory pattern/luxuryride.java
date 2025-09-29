public class luxuryride implements ride {
    private double ratePerKm = 25.0;

    @Override
    public void bookRide(String pickup, String drop) {
        System.out.println("Luxury ride booked from " + pickup + " to " + drop);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public void rideInfo() {
        System.out.println("Luxury Ride: Premium comfort, AC, extra services.");
    }
}