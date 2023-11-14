import packageA.ClassA;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ClassA ca = new ClassA();
        ca.nickName = "Hello";


        int index = 1;
        Question question;
        for (index = 1; index <= 10; index++) {
            if (index <= 5) {
                question = new OneChoiceQuestion();
                question.loadData(index);
                question.display();
            } else {
                question = new FillInTheBlankQuestion();
                question.loadData(index);
                question.display();
            }
        }

//        Question q1;
//        q1 = new OneChoiceQuestion(); // Đa hình trên cách thức class (Polymorphism)
//        q1.loadData(1);
//        // q1.enterData(1); // Đa hình trên cách thức đối tượng (Polymorphism)
//        q1.display(); // Đa hình trên cách thức đối tượng (Polymorphism)
//
//
//        Question q2;
//        q2 = new FillInTheBlankQuestion(); // Đa hình trên cách thức class (Polymorphism)
//        q2.loadData(2);
//        // q2.enterData(2); // Đa hình trên cách thức đối tượng (Polymorphism)
//        q2.display(); // Đa hình trên cách thức đối tượng (Polymorphism)
    }
}