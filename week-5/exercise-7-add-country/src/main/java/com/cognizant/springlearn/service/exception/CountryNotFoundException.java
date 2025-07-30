public class TestClassNotFound {
    public static void main(String[] args) {
        try {
            // Simulate dynamic loading
            Class.forName("com.example.DoesNotExist");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found! Handle it here: " + e.getMessage());
        }
    }
}
