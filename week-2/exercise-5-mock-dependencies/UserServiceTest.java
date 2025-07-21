import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    public void testGetUser() {
        // Step 1: Mock the repository
        UserRepository mockRepository = mock(UserRepository.class);

        // Step 2: Stub a return value
        when(mockRepository.findById(99)).thenReturn("Raji");

        // Step 3: Inject mock into the service
        UserService service = new UserService(mockRepository);

        // Step 4: Call service method
        String result = service.getUser(99);

        // Step 5: Assert and verify
        assertEquals("Raji", result);
        verify(mockRepository).findById(99);
    }
}
