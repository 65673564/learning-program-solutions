import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceUnitTest {

    @Test
    public void testAddition() {
        CalculatorService service = new CalculatorService();
        int result = service.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {
        CalculatorService service = new CalculatorService();
        int result = service.multiply(4, 6);
        assertEquals(24, result);
    }
}
