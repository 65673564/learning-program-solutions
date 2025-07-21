import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppendersDemo {
    private static final Logger logger = LoggerFactory.getLogger(AppendersDemo.class);

    public static void main(String[] args) {
        logger.info("Logging to console and file.");
        logger.warn("This is a warning from AppendersDemo.");
        logger.error("This is an error message.");
    }
}
