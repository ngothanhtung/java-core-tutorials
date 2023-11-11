```java
public class PhanSo {

    public int TuSo;
    public int MauSo;

    public PhanSo() {

    }

    public PhanSo(int tuso, int mauso) {
        this.TuSo = tuso;
        this.MauSo = mauso;
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

    public PhanSo Tru(PhanSo ps) {

        PhanSo ketqua = new PhanSo();

        if (this.MauSo == ps.MauSo) {
            ketqua.TuSo = this.TuSo - ps.TuSo;
            ketqua.MauSo = this.MauSo;

        } else {
            ketqua.TuSo = (this.TuSo * ps.MauSo) - (this.MauSo * ps.TuSo);
            ketqua.MauSo = this.MauSo * ps.MauSo;
        }

        return ketqua;
    }

    public PhanSo Nhan(PhanSo ps) {

        PhanSo ketqua = new PhanSo();

        ketqua.TuSo = this.TuSo * ps.TuSo;
        ketqua.MauSo = this.MauSo * ps.MauSo;

        return ketqua;
    }

    public PhanSo Chia(PhanSo ps) {

        PhanSo daonguoc = new PhanSo();
        daonguoc.TuSo = ps.MauSo;
        daonguoc.MauSo = ps.TuSo;

        PhanSo ketqua = Nhan(daonguoc);

        return ketqua;
    }

    // Rút gọn phân số
    public PhanSo RutGon() {
        PhanSo ketqua = new PhanSo();

        int uscln = UocSoChungLonNhat(this.TuSo, this.MauSo);

        ketqua.TuSo = this.TuSo / uscln;
        ketqua.MauSo = this.MauSo / uscln;

        return ketqua;
    }

    // So sánh 2 phân số
    // Nếu lớn hơn => 1
    // Nếu bằng => 0
    // Nếu nhỏ hơn => -1
    public int SoSanh(PhanSo ps) {
        PhanSo ps1 = this.RutGon();
        PhanSo ps2 = ps.RutGon();

        if (ps1.TuSo == ps2.TuSo && ps1.MauSo == ps2.MauSo) {
            return 0;
        }

        if (ps1.TuSo * ps2.MauSo > ps2.TuSo * ps1.MauSo) {
            return 1;
        }

        return -1;
    }

    // Giai thuat Euclid
    // ref: https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid
    private int UocSoChungLonNhat(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return UocSoChungLonNhat(y, x % y);
        }
    }


    public String print() {
        if (this.MauSo == 1) {
            return this.TuSo + "";
        }

        return this.TuSo + " / " + this.MauSo;
    }

    public float toFloat() {
        return (float) this.TuSo / (float) this.MauSo;
    }
}
```
