public class SoNguyen {

    private int _giaTri;

    public int get_giaTri() {
        return _giaTri;
    }

    public void set_giaTri(int _giaTri) {
        if (_giaTri < 0) {
            throw new IllegalArgumentException("Số nguyên không hợp lệ");
        }
        this._giaTri = _giaTri;
    }
}
