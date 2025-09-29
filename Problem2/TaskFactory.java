import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TaskFactory {
    public static Task createTask(String description, String start, String end, String priority) throws Exception {
        try {
            LocalTime startTime = LocalTime.parse(start);
            LocalTime endTime = LocalTime.parse(end);
            if (endTime.isBefore(startTime)) {
                throw new Exception("End time must be after start time.");
            }
            return new Task(description, startTime, endTime, priority);
        } catch (DateTimeParseException e) {
            throw new Exception("Invalid time format. Use HH:mm.");
        }
    }
}
