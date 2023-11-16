import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FillInTheBlankQuestion extends Question {

    @Override
    public void display() {
        System.out.println(this.get_questionContent());
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Your answer: ");
            String userAnswer = in.nextLine();

            if (this.get_correctAnswer().equals(userAnswer)) {
                System.out.println("Congratulations! You are correct.");
                System.out.println("=============================================");

            } else {
                System.out.println("Sorry! You are wrong.");
                System.out.println("Correct option: " + this.get_correctAnswer());
                System.out.println("=============================================");
            }
        }
    }

    @Override
    public void enterData(int index) {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter question content: ");
            this.set_questionContent(in.nextLine());

            System.out.print("Correct option ");
            this.set_correctAnswer(in.nextLine());
        }
        String fileName = index + ".txt";
        try (FileWriter file = new FileWriter(fileName); BufferedWriter writer = new BufferedWriter(file)) {
            writer.write(this.get_questionContent());
            writer.newLine();
            writer.write(this.get_correctAnswer());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadData(int index) {
        String fileName = index + ".txt";
        try (FileReader file = new FileReader(fileName); BufferedReader reader = new BufferedReader(file)) {
            this.set_questionContent(reader.readLine());
            this.set_correctAnswer(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
