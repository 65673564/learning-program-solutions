import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CustomRepositoryQueryTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductService productService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindByCategory() {
        List<String> electronics = Arrays.asList("TV", "Laptop");

        when(productRepository.findByCategory("Electronics")).thenReturn(electronics);

        List<String> result = productService.getProductsByCategory("Electronics");

        assertEquals(2, result.size());
        assertTrue(result.contains("TV"));
        assertTrue(result.contains("Laptop"));

        verify(productRepository).findByCategory("Electronics");
    }
}
