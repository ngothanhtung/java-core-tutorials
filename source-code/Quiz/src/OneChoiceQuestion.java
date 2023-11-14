import java.io.*;
import java.util.Scanner;

public class OneChoiceQuestion extends Question {
    private String _option1;
    private String _option2;
    private String _option3;
    private String _option4;

    public String get_option1() {
        return _option1;
    }

    public void set_option1(String _option1) {
        this._option1 = _option1;
    }

    public String get_option2() {
        return _option2;
    }

    public void set_option2(String _option2) {
        this._option2 = _option2;
    }

    public String get_option3() {
        return _option3;
    }

    public void set_option3(String _option3) {
        this._option3 = _option3;
    }

    public String get_option4() {
        return _option4;
    }

    public void set_option4(String _option4) {
        this._option4 = _option4;
    }

    @Override
    public void display() {
        System.out.println(this.get_questionContent());
        System.out.println("A: " + this.get_option1());
        System.out.println("B: " + this.get_option2());
        System.out.println("C: " + this.get_option3());
        System.out.println("D: " + this.get_option4());
        System.out.println("------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Your answer: ");
        String userAnswer = in.nextLine();

        if (this.get_correctAnswer().equals(userAnswer)) {
            System.out.println("Congratulations! You are correct.");
            System.out.println("=============================================");
        }
        else {
            System.out.println("Sorry! You are wrong.");
            System.out.println("Correct option: " + this.get_correctAnswer());
            System.out.println("=============================================");
        }
    }

    @Override
    public void enterData(int index) {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter question content: ");
        this.set_questionContent(in.nextLine());

        System.out.print("Enter option A: ");
        this.set_option1(in.nextLine());

        System.out.print("Enter option B: ");
        this.set_option2(in.nextLine());

        System.out.print("Enter option C: ");
        this.set_option3(in.nextLine());

        System.out.print("Enter option D: ");
        this.set_option4(in.nextLine());

        System.out.print("Correct answer: ");
        this.set_correctAnswer(in.nextLine());

        // Ghi dữ liệu vào file
        String fileName = index + ".txt";
        try (FileWriter file = new FileWriter(fileName); BufferedWriter writer = new BufferedWriter(file)) {

            writer.write(this.get_questionContent());
            writer.newLine();

            writer.write(this.get_option1());
            writer.newLine();

            writer.write(this.get_option2());
            writer.newLine();

            writer.write(this.get_option3());
            writer.newLine();

            writer.write(this.get_option4());
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
            this.set_option1(reader.readLine());
            this.set_option2(reader.readLine());
            this.set_option3(reader.readLine());
            this.set_option4(reader.readLine());
            this.set_correctAnswer(reader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
