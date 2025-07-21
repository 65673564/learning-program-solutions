import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MockRepositoryServiceTest {

    @Mock
    StudentRepository repository;

    @InjectMocks
    StudentService service;

    public MockRepositoryServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetStudentName() {
        when(repository.findNameById(100)).thenReturn("Atchaya");

        String result = service.getStudentName(100);
        assertEquals("Atchaya", result);

        verify(repository).findNameById(100);
    }
}
