package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class FileDeleterTest {

    @Test
    void testDeleteFileThrowsException() {
        FileManager mockFileManager = mock(FileManager.class);
        doThrow(new RuntimeException("File not found")).when(mockFileManager).deleteFile("missing.txt");

        FileDeleter deleter = new FileDeleter(mockFileManager);
        String result = deleter.delete("missing.txt");

        assertEquals("Failed: File not found", result);
    }
}
