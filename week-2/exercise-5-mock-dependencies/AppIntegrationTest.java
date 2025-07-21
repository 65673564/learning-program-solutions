import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest {

    @Test
    public void testCheckoutIntegration() {
        // Step 1: Mock the service
        PaymentService mockPaymentService = mock(PaymentService.class);

        // Step 2: Define behavior
        when(mockPaymentService.process("atcha123")).thenReturn("PAID");

        // Step 3: Inject mock into App
        App app = new App(mockPaymentService);

        // Step 4: Call method and verify integration
        String status = app.checkout("atcha123");

        assertEquals("Status: PAID", status);
        verify(mockPaymentService).process("atcha123");
    }
}
