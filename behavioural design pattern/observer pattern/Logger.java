import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void log(String message) {
        System.out.println("[" + LocalTime.now().format(formatter) + "] " + message);
    }

    public static void logError(String message) {
        System.err.println("[" + LocalTime.now().format(formatter) + "] ERROR: " + message);
    }
}
