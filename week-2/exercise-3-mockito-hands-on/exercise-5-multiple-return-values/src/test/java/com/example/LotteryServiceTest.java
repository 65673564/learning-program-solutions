package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

class LotteryServiceTest {

    @Test
    void testDrawTwoNumbersReturnsDifferentResults() {
        RandomNumberGenerator mockRng = mock(RandomNumberGenerator.class);

        // Stub to return 42 first, then 99
        when(mockRng.generate()).thenReturn(42).thenReturn(99);

        LotteryService service = new LotteryService(mockRng);
        int[] result = service.drawTwoNumbers();

        assertArrayEquals(new int[] { 42, 99 }, result);
    }
}
