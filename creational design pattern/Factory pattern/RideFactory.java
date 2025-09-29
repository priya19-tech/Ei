public class RideFactory {
    public ride createRide(String rideType) {
        switch (rideType.toLowerCase()) {
            case "bike":
                return new bikeride();
            case "car":
                return new carride();
            case "luxury":
                return new luxuryride();
            case "shared":
                return new sharedride();
            default:
                throw new IllegalArgumentException("Unknown ride type: " + rideType);
        }
    }
}
