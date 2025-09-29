public class Investor implements Observer {
    private final String name;

    public Investor(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Investor name cannot be empty.");
        }
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        Logger.log(name + " received update: Stock " + stockSymbol + " is now $" + price);
    }
}
