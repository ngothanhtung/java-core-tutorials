// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(6, 5);
        ps1 = ps1.RutGon();
        ps1.InRaManHinh();

        PhanSo ps2 = new PhanSo(3, 5);
        ps2.InRaManHinh();


        PhanSo ps3 = ps1.Cong(ps2);
        ps3.InRaManHinh();
    }
}