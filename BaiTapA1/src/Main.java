import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // A1. Nhập vào 03 số nguyên. Sau đó in tổng của 03 số đó theo định dạng như sau: "Tong cua 03 so nguyen a, b, c la: "
        int a;
        int b;
        int c;
        // Nhập từ bàn phím:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số nguyên c: ");
        c = scanner.nextInt();
        // In ra màn hình:
        System.out.format("Tổng của 03 số nguyên a, b, c là: %d", (a + b + c));
    }
}