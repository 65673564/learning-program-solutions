import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

interface UserRepository {
    String findEmailById(int id);
    List<String> getRoles();
}

interface ExternalApi {
    String get(String url) throws IOException;
}

class UserService {
    private final UserRepository repository;
    private final ExternalApi api;

    public UserService(UserRepository repository, ExternalApi api) {
        this.repository = repository;
        this.api = api;
    }

    public String getUserEmailById(int id) {
        return repository.findEmailById(id);
    }

    public String fetchDataFromApi(String endpoint) throws IOException {
        return api.get(endpoint);
    }

    public String readFile(BufferedReader reader) throws IOException {
        return reader.readLine();
    }

    public List<String> getUserRoles() {
        return repository.getRoles();
    }
}

public class UserServiceTest {

    @Test
    void testMockDatabaseRepository() {
        UserRepository mockRepo = mock(UserRepository.class);
        ExternalApi mockApi = mock(ExternalApi.class);
        UserService service = new UserService(mockRepo, mockApi);

        when(mockRepo.findEmailById(1)).thenReturn("atcha@example.com");
        assertEquals("atcha@example.com", service.getUserEmailById(1));
    }

    @Test
    void testMockExternalApi() throws IOException {
        ExternalApi mockApi = mock(ExternalApi.class);
        UserRepository repo = mock(UserRepository.class);
        UserService service = new UserService(repo, mockApi);

        when(mockApi.get("https://dummyapi.com")).thenReturn("Success");
        assertEquals("Success", service.fetchDataFromApi("https://dummyapi.com"));
    }

    @Test
    void testMockFileIO() throws IOException {
        BufferedReader reader = mock(BufferedReader.class);
        UserService service = new UserService(null, null);

        when(reader.readLine()).thenReturn("Hello File!");
        assertEquals("Hello File!", service.readFile(reader));
    }

    @Test
    void testMultipleReturnValuesInSequence() {
        UserRepository mockRepo = mock(UserRepository.class);
        ExternalApi api = mock(ExternalApi.class);
        UserService service = new UserService(mockRepo, api);

        when(mockRepo.getRoles())
            .thenReturn(Arrays.asList("ADMIN"))
            .thenReturn(Arrays.asList("USER", "GUEST"));

        assertEquals(List.of("ADMIN"), service.getUserRoles());
        assertEquals(List.of("USER", "GUEST"), service.getUserRoles());
    }
}
