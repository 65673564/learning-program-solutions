package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;

class PerformanceServiceTest {

    PerformanceService service = new PerformanceService();

    @Test
    void testPerformance() {
        assertTimeout(Duration.ofMillis(200), () -> {
            service.loadBigData();
        });
    }
}
