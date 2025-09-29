import java.util.Scanner;

// Singleton class
class ElectricityGridManager {
    private static ElectricityGridManager instance;

    private int totalPowerConsumed = 0;

    private ElectricityGridManager() {
        System.out.println("⚡ Electricity Grid Manager initialized!");
    }

    public static ElectricityGridManager getInstance() {
        if (instance == null) {
            instance = new ElectricityGridManager();
        }
        return instance;
    }

    public void reportConsumption(String consumerName, int units) {
        totalPowerConsumed += units;
        System.out.println("Consumer: " + consumerName + " reported " + units + " units.");
        System.out.println("Total power consumed in city: " + totalPowerConsumed + " units.");
    }

    public void showStatus() {
        System.out.println("\n📊 Current city power status: " + totalPowerConsumed + " units consumed.");
    }
}

// Client
public class SingletonElectricityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricityGridManager manager = ElectricityGridManager.getInstance();

        System.out.println("Welcome to City Electricity Monitoring System!");

        boolean continueReporting = true;

        while (continueReporting) {
            System.out.print("\nEnter consumer name: ");
            String name = sc.nextLine();

            System.out.print("Enter power consumption (units): ");
            int units = sc.nextInt();
            sc.nextLine(); // consume newline

            manager.reportConsumption(name, units);

            System.out.print("Report another consumer? (yes/no): ");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("no")) {
                continueReporting = false;
            }
        }

        manager.showStatus();

        // Demonstrate singleton
        ElectricityGridManager anotherManager = ElectricityGridManager.getInstance();
        if (manager == anotherManager) {
            System.out.println("\n Verified: Only ONE ElectricityGridManager exists!");
        }

        sc.close();
    }
}
