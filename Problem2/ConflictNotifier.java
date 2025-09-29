public class ConflictNotifier implements ConflictObserver {
    @Override
    public void notifyConflict(Task newTask, Task existingTask) {
        System.out.println("Conflict: " + newTask.getDescription() +
                " overlaps with " + existingTask.getDescription());
    }
}
