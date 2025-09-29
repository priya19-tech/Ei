package strategies;

import java.util.logging.Logger;

public class EcoBikeDelivery implements DeliveryStrategy {
    private static final Logger logger = Logger.getLogger(EcoBikeDelivery.class.getName());

    @Override
    public void deliver(String orderDetails) {
        logger.info("Eco-Bike Delivery selected.");
        System.out.println("Eco-Bike Delivery: " + orderDetails + " will arrive in 60-70 mins (eco-friendly).");
    }

    @Override
    public double calculateCost(double baseCost) {
        return baseCost - 10;
    }
}
