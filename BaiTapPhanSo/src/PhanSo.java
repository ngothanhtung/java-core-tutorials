public class PhanSo {
    public int TuSo;
    public int MauSo;

    // Constructor / Hàm khởi tạo

    // Default constructor / Hàm khởi tạo mặc định
    public PhanSo() {

    }

    // Constructor with parameters / Hàm khởi tạo với tham số
    public PhanSo(int t, int m) {
        this.TuSo = t;
        this.MauSo = m;
    }

    public void InRaManHinh() {
        System.out.format("%d / %d\n", this.TuSo, this.MauSo);
    }


    private int UocSoChungLonNhat(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return UocSoChungLonNhat(y, x % y);
        }
    }
    public PhanSo RutGon() {
        PhanSo ketqua = new PhanSo();

        int uscln = UocSoChungLonNhat(this.TuSo, this.MauSo);

        ketqua.TuSo = this.TuSo / uscln;
        ketqua.MauSo = this.MauSo / uscln;

        return ketqua;
    }

    public PhanSo Cong(PhanSo ps) {
        PhanSo ketqua = new PhanSo();

        if (this.MauSo == ps.MauSo) {
            ketqua.TuSo = this.TuSo + ps.TuSo;
            ketqua.MauSo = this.MauSo;

        } else {
            ketqua.TuSo = (this.TuSo * ps.MauSo) + (this.MauSo * ps.TuSo);
            ketqua.MauSo = this.MauSo * ps.MauSo;
        }

        return ketqua;
    }
}
