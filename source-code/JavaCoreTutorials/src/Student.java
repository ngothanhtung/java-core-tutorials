public class Student {
    // Static variables
    public static String SchoolName = "SOFTECH APTECH";

    // Instance variables
    public String name;
    public String email;

    public float score;

    private void display() {
        // Local variables
        String x = "-";

        // Print with format
        System.out.format("Name: %s\nEmail: %s\n", name, email);
    }
}
