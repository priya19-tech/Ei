import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Stock> stocks = new HashMap<>();
        stocks.put("AAPL", new Stock("AAPL", 150));
        stocks.put("GOOGL", new Stock("GOOGL", 2800));
        stocks.put("TSLA", new Stock("TSLA", 700));

        System.out.print("Enter your name: ");
        String investorName = scanner.nextLine();
        Investor investor = new Investor(investorName);

        System.out.println("Available stocks: " + stocks.keySet());
        System.out.print("Enter stock symbol to subscribe: ");
        String symbol = scanner.nextLine().toUpperCase();

        Stock stock = stocks.get(symbol);
        if (stock == null) {
            Logger.logError("Invalid stock symbol.");
            return;
        }

        stock.registerObserver(investor);

        while (true) {
            System.out.print("Enter new price for " + stock.getSymbol() + " (or 'exit' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                double newPrice = Double.parseDouble(input);
                stock.updatePrice(newPrice);
            } catch (NumberFormatException e) {
                Logger.logError("Invalid number format.");
            }
        }

        scanner.close();
        Logger.log("Program terminated.");
    }
}
