import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks = new ArrayList<>();
    private List<ConflictObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addObserver(ConflictObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Task newTask, Task existingTask) {
        for (ConflictObserver observer : observers) {
            observer.notifyConflict(newTask, existingTask);
        }
    }

    public void addTask(Task newTask) {
        for (Task t : tasks) {
            if (!(newTask.getEndTime().isBefore(t.getStartTime()) || newTask.getStartTime().isAfter(t.getEndTime()))) {
                notifyObservers(newTask, t);
                return;
            }
        }
        tasks.add(newTask);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        System.out.println("Task added successfully: " + newTask.getDescription());
    }

    public void removeTask(String description) {
        boolean removed = tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
        if (removed) {
            System.out.println("🗑️ Task removed: " + description);
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    public void markTaskCompleted(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.markCompleted();
                System.out.println("Task marked as completed: " + description);
                return;
            }
        }
        System.out.println(" Error: Task not found.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("📭 No tasks scheduled for the day.");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void viewByPriority(String priority) {
        tasks.stream()
                .filter(t -> t.getPriority().equalsIgnoreCase(priority))
                .forEach(System.out::println);
    }
}
