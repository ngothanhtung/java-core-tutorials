public class Student extends Person {

    private float _score;
    private  float _tuition;
    private int _attendance;

    public float get_score() {
        return _score;
    }

    public void set_score(float _score) {
        if (_score < 0) {
            throw new IllegalArgumentException("Score cannot be less than 0");
        }
        if (_score > 10) {
            throw new IllegalArgumentException("Score cannot be greater than 10");
        }
        this._score = _score;
    }

    public float get_tuition() {
        return _tuition;
    }

    public void set_tuition(float _tuition) {
        if (_tuition < 0) {
            throw new IllegalArgumentException("Tuition cannot be less than 0");
        }
        this._tuition = _tuition;
    }

    public int get_attendance() {
        return _attendance;
    }

    public void set_attendance(int _attendance) {
        if (_attendance < 0) {
            throw new IllegalArgumentException("Attendance cannot be less than 0");
        }
        this._attendance = _attendance;
    }

    public void print() {
        super.print();
        System.out.println("Score: " + this._score);
        System.out.println("Tuition: " + this._tuition);
        System.out.println("Attendance: " + this._attendance);
    }
}
