import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int score = 0;
        double money = 0;
        Question question;

        for (int index = 1; index <= 10; index++) {
            System.out.println("=============================================");
            System.out.println("Question " + index);
            System.out.println("=============================================");

            try {
                if (index <= 5) {
                    question = new OneChoiceQuestion();
                    question.loadData(index);
                } else {
                    question = new FillInTheBlankQuestion();
                    question.loadData(index);
                }

                boolean result = question.display();

                if (result) {
                    score++;
                    money += 100000;
                    System.out.println("Congratulations! You are correct.");
                    System.out.println("=============================================");
                } else {
                    System.out.println("Sorry! You are wrong.");
                    System.out.println("Correct answer: " + question.getCorrectAnswer());
                    System.out.println("=============================================");
                }

                System.out.println("Your score: " + score);
                // format money with 2 decimal places
                System.out.printf("Your money: %.0f\n", money);

            } catch (IOException e) {
                System.err.println("Error loading question " + index + ": " + e.getMessage());
                System.out.println("Skipping to next question...");
            }
        }

        // Question q1;
        // q1 = new OneChoiceQuestion(); // Đa hình trên cách thức class (Polymorphism)
        // q1.loadData(1);
        // // q1.enterData(1); // Đa hình trên cách thức đối tượng (Polymorphism)
        // q1.display(); // Đa hình trên cách thức đối tượng (Polymorphism)
        //
        //
        // Question q2;
        // q2 = new FillInTheBlankQuestion(); // Đa hình trên cách thức class
        // (Polymorphism)
        // q2.loadData(2);
        // // q2.enterData(2); // Đa hình trên cách thức đối tượng (Polymorphism)
        // q2.display(); // Đa hình trên cách thức đối tượng (Polymorphism)
    }
}