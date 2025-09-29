package strategies;

import java.util.logging.Logger;

public class DroneDelivery implements DeliveryStrategy {
    private static final Logger logger = Logger.getLogger(DroneDelivery.class.getName());

    @Override
    public void deliver(String orderDetails) {
        logger.info("Drone Delivery selected.");
        System.out.println(" Drone Delivery: " + orderDetails + " will arrive in 10 mins!");
    }

    @Override
    public double calculateCost(double baseCost) {
        return baseCost + 100;
    }
}
