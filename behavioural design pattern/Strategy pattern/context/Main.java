import context.DeliveryContext;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
import strategies.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeliveryContext context = new DeliveryContext();
        double baseCost = 200.0;
        boolean exit = false;

        System.out.println("===== 🍴 Food Delivery =====");

        while (!exit) {
            try {
                System.out.println("\nChoose a Delivery Option:");
                System.out.println("1. Normal Delivery");
                System.out.println("2. Express Delivery");
                System.out.println("3. Drone Delivery");
                System.out.println("4. Eco-Bike Delivery");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 5) {
                    System.out.println("Thank you for using Food Delivery!");
                    exit = true;
                    continue;
                }

                System.out.print("Enter your order details: ");
                String order = scanner.nextLine();

                switch (choice) {
                    case 1 -> context.setStrategy(new NormalDelivery());
                    case 2 -> context.setStrategy(new ExpressDelivery());
                    case 3 -> context.setStrategy(new DroneDelivery());
                    case 4 -> context.setStrategy(new EcoBikeDelivery());
                    default -> {
                        System.out.println("❌ Invalid option. Try again.");
                        continue;
                    }
                }

                context.executeDelivery(order, baseCost);

            } catch (InputMismatchException e) {
                logger.severe("Invalid input: " + e.getMessage());
                System.out.println("❌ Please enter numbers only.");
                scanner.nextLine(); // clear buffer
            } catch (IllegalStateException e) {
                logger.severe("Execution error: " + e.getMessage());
                System.out.println("⚠️ Error: " + e.getMessage());
            } catch (Exception e) {
                logger.severe("Unexpected error: " + e.getMessage());
                System.out.println("⚠️ Something went wrong. Try again.");
            }
        }

        scanner.close();
    }
}
