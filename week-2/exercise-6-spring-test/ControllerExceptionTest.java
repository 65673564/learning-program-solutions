import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DemoController.class)
public class ControllerExceptionTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testDivideByZeroException() throws Exception {
        mockMvc.perform(get("/api/divide?a=10&b=0"))
               .andExpect(status().isBadRequest())
               .andExpect(content().string("Cannot divide by zero!"));
    }

    @Test
    public void testValidDivision() throws Exception {
        mockMvc.perform(get("/api/divide?a=10&b=2"))
               .andExpect(status().isOk())
               .andExpect(content().string("5"));
    }
}
