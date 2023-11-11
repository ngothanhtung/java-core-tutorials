public class Student {
    public String name;
    public int age;
    public float score;

    // ENCAPSULATION
    // 1. Private fields
    // 2. Public getters and setters
    private float mathScore;
    public void setMathScore(float value) {
        if (value >= 0 && value <= 10) {
            this.mathScore = value;
        }
        else {
            throw new IllegalArgumentException("Điểm toán không hợp lệ");
        }
    }
    public float getMathScore() {
        return this.mathScore;
    }

    public float englishScore;
    public boolean gender;

    public void display() {
        System.out.format("Họ và tên: %s\n", this.name);
        System.out.format("Tuổi: %d\n", this.age);
        System.out.format("Điểm: %f\n", this.score);
        System.out.format("Điểm toán: %f\n", this.mathScore);
        System.out.format("Điểm TA: %f\n", this.englishScore);
        System.out.format("Giới tính: %s\n", this.gender ? "Nam" : "Nữ");
    }
}
