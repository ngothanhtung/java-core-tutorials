// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Nguyen Van Tuan";
        s1.age = 18;
        s1.score = 15.5f;
        s1.setMathScore(19.5f);

        float mathScore = s1.getMathScore();
        s1.englishScore = 8f;
        s1.gender = true;
        s1.display();

        Student s2 = new Student();
        s2.name = "Tran Van Nam";
        s2.age = 19;
        s2.score = 16.5f;
        s2.gender = true;

        System.out.format("-------------------------\n");
        s2.display();

        Student s3 = new Student();
        s3.name = "Pham Thi Hong";
        s3.age = 18;
        s3.score = 18.0f;
        s3.gender = false;

        System.out.format("-------------------------\n");
        s3.display();
    }
}