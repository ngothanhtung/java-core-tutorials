import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DAY 01
        short age = 43;
        int year = 2021;
        long salary = 1000000000L;
        double weight = 70.5;
        float height = 1.7f;

        System.out.format("Age: %d\n", age);
        System.out.format("Year: %d\n", year);
        System.out.format("Salary: %d\n", salary);
        System.out.format("Weight: %f\n", weight);
        System.out.format("Height: %f\n", height);


        boolean gender = true;
        char group = 'A';
        String name = "Nguyen Van A";
        // Array hobbies
        String[] hobbies = {"Reading", "Music", "Sport"};

        // Khai báo hằng số
        final float PI = 3.14f;
        // Bán kính
        double radius = 5.5;
        // Tính diện tích
        double area = radius * radius * PI;

        // Khai báo enum: enum Season { SPRING, SUMMER, AUTUMN, WINTER }
        enum Season { SPRING, SUMMER, AUTUMN, WINTER }
        // Print with format
        System.out.format("Season: \n%s\n%s", Season.SPRING, Season.AUTUMN);

        // Nhập liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();

        // In ra màn hình
        System.out.format("Name: %s\nAge: %d\n", inputName, inputAge);



    }
}