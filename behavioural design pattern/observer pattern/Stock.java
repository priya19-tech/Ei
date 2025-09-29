import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private final String symbol;
    private double price;
    private final List<Observer> observers;

    public Stock(String symbol, double price) {
        if (symbol == null || symbol.trim().isEmpty()) {
            throw new IllegalArgumentException("Stock symbol cannot be empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Stock price cannot be negative.");
        }
        this.symbol = symbol;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) {
            Logger.logError("Cannot register null observer.");
            return;
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
            Logger.log("Investor subscribed to stock: " + symbol);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.remove(observer)) {
            Logger.log("Investor unsubscribed from stock: " + symbol);
        }
    }

    @Override
    public void notifyObservers(String stockSymbol, double price) {
        for (Observer observer : observers) {
            try {
                observer.update(stockSymbol, price);
            } catch (Exception e) {
                Logger.logError("Failed to notify observer: " + e.getMessage());
            }
        }
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            Logger.logError("Invalid price entered.");
            return;
        }
        if (newPrice != price) {
            price = newPrice;
            Logger.log("Stock " + symbol + " price updated to $" + price);
            notifyObservers(symbol, price);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }
}
