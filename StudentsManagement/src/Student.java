public class Student {
    public String name;
    public int age;
    public float score;
    public boolean gender;

    public void display() {
        System.out.format("Họ và tên: %s\n", this.name);
        System.out.format("Tuổi: %d\n", this.age);
        System.out.format("Điểm: %2f\n", this.score);
        System.out.format("Giới tính: %s\n", this.gender ? "Nam" : "Nữ");
    }
}
