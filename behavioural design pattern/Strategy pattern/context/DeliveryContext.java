package context;

import java.util.logging.Logger;
import strategies.DeliveryStrategy;

public class DeliveryContext {
    private static final Logger logger = Logger.getLogger(DeliveryContext.class.getName());
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
        logger.info("Delivery strategy set to: " + strategy.getClass().getSimpleName());
    }

    public void executeDelivery(String orderDetails, double baseCost) {
        if (strategy == null) {
            throw new IllegalStateException("Delivery strategy not set.");
        }

        double totalCost = strategy.calculateCost(baseCost);
        System.out.println("Total Delivery Cost: ₹" + totalCost);
        strategy.deliver(orderDetails);
    }
}
