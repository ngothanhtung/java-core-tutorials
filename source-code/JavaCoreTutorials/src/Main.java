import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print with format
        System.out.println("Hello\tWorld!");




        // Declare variables
        // Khai báo biến

        short age = 43; // size = 2 bytes = 16 bits = [-32768, 32767]
        int year = 2021; // size = 4 bytes = 32 bits = [-2^31, 2^31 - 1] = [-2147483648, 2147483647]
        long salary = 1000000000L; // size = 8 bytes = 64 bits = [-2^63, 2^63 - 1] = [-9223372036854775808, 9223372036854775807]
        double weight = 70.5; // size = 8 bytes = 64 bits
        float height = 1.7f; // size = 4 bytes = 32 bits
        boolean gender = true; // size = 1 bit = [0, 1]
        // 1 byte = 8 bits = 2^8 = 256 ký tự
        char group = 'A'; // size = 2 bytes = 16 bits = [0, 65535]
//        String nameX = new String("Nguyen Van A");
        String name = "Nguyen Van A";
        // Array hobbies
        String[] hobbies = { "Reading", "Music", "Sport" };

        char address = 'A';
        Student s1 = new Student();
        s1.name = "Nguyen Van A";
        s1.email = "a@gmail.com";
        s1.score = 8.5f;

        Student s2 = new Student();
        s2.name = "Nguyen Van B";
        s2.email = "b@gmailc.om";
        s2.score = 9.5f;

        System.out.println("Name: " + s1.name);
        System.out.println("Email: " + s1.email);

        System.out.println("Name: " + s2.name);
        System.out.println("Email: " + s2.email);

        // Underscore in numeric literals
        int x = 10_000_000;
        System.out.format("x: %d\n", x);

        float pi =  3.14_15F;
        System.out.format("pi: %f\n", pi);

        long bytes = 0b1001_0010;
        // Calculate 0b1001_0010 to decimal

        // Tính 0b1001_0010 sang hệ thập phân, bằng cách nhân lần lượt từ phải sang trái, bắt đầu từ 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048,
        // sau đó cộng lại với nhau

        System.out.format("bytes: %d\n", bytes);

        // Print with format
        // In ra màn hình
        System.out.format("Age: %d\n", age);
        System.out.format("Year: %d\n", year);
        System.out.format("Salary: %d\n", salary);
        System.out.format("Weight: %f\n", weight);
        System.out.format("Height: %f\n", height);

        // Khai báo hằng số
        final float PI = 3.14f;
        // Bán kính
        double radius = 5.5;
        // Tính diện tích
        double area = radius * radius * PI;

        // Khai báo enum (Kiểu liệt kê)
        enum Season{SPRING,SUMMER,AUTUMN,WINTER}
        // Print with format
        System.out.format("Season: \n%s\n%s", Season.SPRING, Season.AUTUMN);

        // Enter data from keyboard
        // Nhập liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();

        System.out.print("Enter your weight: ");
        float inputWeight = scanner.nextFloat();

        System.out.print("Enter your salary: ");
        long inputSalary = scanner.nextLong();

        System.out.print("Enter your gender: ");
        boolean inputGender = scanner.nextBoolean();

        // In ra màn hình
        System.out.format("Name: %s\nAge: %d\n", inputName, inputAge);

        System.out.print("Enter your score: ");
        float score = scanner.nextFloat();

        // DECISION-MAKING
        // IF ELSE
        if (score >= 9.0f) {
            System.out.println("Excellent");
        } else if (score >= 8.0f) {
            System.out.println("Very good");
        } else if (score >= 6.5f) {
            System.out.println("Good");
        } else if (score >= 5.0f) {
            System.out.println("Average");
        } else {
            System.out.println("Weak");
        }

        // USING SWITCH
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        // PRINT NAME OF SEASON
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        // PRINT NAME OF MONTH
        switch (month) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        // LOOP
        // FOR LOOP
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // FOR EACH
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        // WHILE LOOP
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // DO WHILE LOOP
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        // BREAK;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        // CONTINUE
        for (i = 0; i < 10; i++) {
            if (i > 5) {
                continue;
            }
            System.out.println(i);
        }
        // LABEL
        outer: for (i = 0; i < 10; i++) {
            inner: for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break outer;
                }
                System.out.println(j);
            }
        }

    }
}