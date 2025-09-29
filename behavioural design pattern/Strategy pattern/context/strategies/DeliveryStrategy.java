package strategies;

public interface DeliveryStrategy {
    void deliver(String orderDetails);
    double calculateCost(double baseCost);
}
