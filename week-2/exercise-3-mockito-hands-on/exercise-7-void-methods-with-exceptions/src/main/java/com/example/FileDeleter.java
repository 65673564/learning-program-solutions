package com.example;

public class FileDeleter {

    private FileManager fileManager;

    public FileDeleter(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public String delete(String file) {
        try {
            fileManager.deleteFile(file);
            return "Deleted";
        } catch (Exception e) {
            return "Failed: " + e.getMessage();
        }
    }
}
