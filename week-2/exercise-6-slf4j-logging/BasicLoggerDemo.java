import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicLoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(BasicLoggerDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            int result = divide(10, 0); // will cause exception
            logger.info("Result: {}", result);
        } catch (ArithmeticException ex) {
            logger.error("An error occurred while dividing: {}", ex.getMessage());
        }

        logger.warn("This is a warning message for deprecated API call");
        logger.info("Application ended");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
