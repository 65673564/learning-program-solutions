import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggerDemo.class);

    public static void main(String[] args) {
        String user = "Raji";
        int items = 5;
        double price = 499.99;

        logger.info("User {} purchased {} items totaling ₹{}", user, items, price);

        String status = "DELIVERED";
        logger.info("Order status: {}", status);

        String warningItem = "Smartwatch";
        logger.warn("Stock running low for item: {}", warningItem);
    }
}
