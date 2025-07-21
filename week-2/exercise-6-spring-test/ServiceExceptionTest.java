import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceExceptionTest {

    @Test
    public void testProcessOrderThrowsException() {
        OrderService service = new OrderService();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.processOrder(0);
        });

        assertEquals("Quantity must be greater than 0", exception.getMessage());
    }

    @Test
    public void testProcessOrderSuccess() {
        OrderService service = new OrderService();
        String result = service.processOrder(3);
        assertEquals("Order placed with quantity: 3", result);
    }
}
