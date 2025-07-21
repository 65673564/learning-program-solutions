import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedServiceTest {

    private final MathService mathService = new MathService();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    public void testIsEvenForEvenNumbers(int input) {
        assertTrue(mathService.isEven(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    public void testIsEvenForOddNumbers(int input) {
        assertFalse(mathService.isEven(input));
    }
}
