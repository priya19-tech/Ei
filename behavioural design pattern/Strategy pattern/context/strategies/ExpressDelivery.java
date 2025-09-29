package strategies;

import java.util.logging.Logger;

public class ExpressDelivery implements DeliveryStrategy {
    private static final Logger logger = Logger.getLogger(ExpressDelivery.class.getName());

    @Override
    public void deliver(String orderDetails) {
        logger.info("Express Delivery selected.");
        System.out.println(" Express Delivery: " + orderDetails + " will arrive in 20-30 mins.");
    }

    @Override
    public double calculateCost(double baseCost) {
        return baseCost + 50;
    }
}
