import java.util.Scanner;

public class AstronautScheduleApp {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addObserver(new ConflictNotifier());

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Astronaut Daily Schedule ---");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Mark Task Completed");
            System.out.println("5. View Tasks by Priority");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Description: ");
                        String desc = sc.nextLine();
                        System.out.print("Start Time (HH:mm): ");
                        String start = sc.nextLine();
                        System.out.print("End Time (HH:mm): ");
                        String end = sc.nextLine();
                        System.out.print("Priority (High/Medium/Low): ");
                        String priority = sc.nextLine();
                        Task task = TaskFactory.createTask(desc, start, end, priority);
                        manager.addTask(task);
                        break;
                    case 2:
                        System.out.print("Task to remove: ");
                        manager.removeTask(sc.nextLine());
                        break;
                    case 3:
                        manager.viewTasks();
                        break;
                    case 4:
                        System.out.print("Task to mark completed: ");
                        manager.markTaskCompleted(sc.nextLine());
                        break;
                    case 5:
                        System.out.print("Priority level (High/Medium/Low): ");
                        manager.viewByPriority(sc.nextLine());
                        break;
                    case 6:
                        System.out.println("Exiting Schedule Organizer.");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println(" " + e.getMessage());
            }
        }
    }
}
