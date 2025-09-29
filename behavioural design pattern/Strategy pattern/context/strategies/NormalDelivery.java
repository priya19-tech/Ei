package strategies;

import java.util.logging.Logger;

public class NormalDelivery implements DeliveryStrategy {
    private static final Logger logger = Logger.getLogger(NormalDelivery.class.getName());

    @Override
    public void deliver(String orderDetails) {
        logger.info("Normal Delivery selected.");
        System.out.println("Normal Delivery: " + orderDetails + " will arrive in 40-50 mins.");
    }

    @Override
    public double calculateCost(double baseCost) {
        return baseCost;
    }
}
