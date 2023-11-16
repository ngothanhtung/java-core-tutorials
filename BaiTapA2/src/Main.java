import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // Nhập vào 03 số nguyên. Sau đó in trung bình cộng của 03 số đó theo định dạng như sau: "TBC cua 03 so nguyen a, b, c la: "
        int a;
        int b;
        int c;

        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a = in.nextInt();
        System.out.print("Nhap so nguyen b: ");
        b = in.nextInt();
        System.out.print("Nhap so nguyen c: ");
        c = in.nextInt();

        double tbc = (a + b + c) / 3.0;
        System.out.printf("TBC cua 03 so nguyen %d, %d, %d la: %.2f\n", a, b, c, tbc);
    }
}