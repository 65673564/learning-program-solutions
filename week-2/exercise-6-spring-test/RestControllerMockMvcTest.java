import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingController.class)
public class RestControllerMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGreetEndpoint() throws Exception {
        mockMvc.perform(get("/api/greet?name=Raji"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, Raji!"));
    }
}
