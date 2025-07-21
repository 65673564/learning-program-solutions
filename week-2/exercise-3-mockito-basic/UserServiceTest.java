import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// A simple UserService that calls UserRepository
class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName(int userId) {
        return userRepository.findNameById(userId);
    }
}

// A dummy repository interface
interface UserRepository {
    String findNameById(int id);
}

public class UserServiceTest {

    @Test
    public void testGetUserName() {
        // Step 1: Create a mock
        UserRepository mockRepo = Mockito.mock(UserRepository.class);

        // Step 2: Define behavior
        when(mockRepo.findNameById(1)).thenReturn("Atchaya");

        // Step 3: Inject mock into service
        UserService userService = new UserService(mockRepo);

        // Step 4: Call the method
        String result = userService.getUserName(1);

        // Step 5: Assert the result
        assertEquals("Atchaya", result);

        // Step 6: Verify interaction
        verify(mockRepo).findNameById(1);
    }
}
