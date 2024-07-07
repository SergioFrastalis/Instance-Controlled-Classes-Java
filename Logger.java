package gr.aueb.cf.ch14.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static final Logger INSTANCE = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void logMessage(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.err.println(timestamp + " - " + message);
    }


     //test if it works
//    public static void main(String[] args) {
//        // Example usage
//        Logger logger = Logger.getInstance();
//        logger.logMessage("This is a log message.");
//    }
}
