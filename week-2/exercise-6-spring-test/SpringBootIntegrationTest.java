import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpringBootIntegrationTest {

    @Autowired
    private WelcomeService welcomeService;

    @Test
    public void testWelcomeService() {
        String msg = welcomeService.sayWelcome();
        assertEquals("Welcome to Spring Boot, Raji!", msg);
    }
}
