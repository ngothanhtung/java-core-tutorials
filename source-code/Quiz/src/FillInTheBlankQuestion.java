import java.io.*;
import java.util.Scanner;

public class FillInTheBlankQuestion extends Question {

    // Constructors
    public FillInTheBlankQuestion() {
        super();
    }

    public FillInTheBlankQuestion(String questionContent, String correctAnswer) {
        super(questionContent, correctAnswer);
    }

    @Override
    public boolean display() {
        System.out.println(getQuestionContent());
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            return isCorrectAnswer(userAnswer);
        }
    }

    @Override
    public void enterData(int index) throws IOException {
        System.out.println("-------------------------------------------------");
        System.out.println("ENTER QUESTION " + index);
        System.out.println("-------------------------------------------------");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter question content: ");
            setQuestionContent(scanner.nextLine());

            System.out.print("Correct answer: ");
            setCorrectAnswer(scanner.nextLine());
        }

        // Save data to file
        saveToFile(index);
    }

    @Override
    public void loadData(int index) throws IOException {
        String fileName = index + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            setQuestionContent(readLineOrEmpty(reader));
            setCorrectAnswer(readLineOrEmpty(reader));
        }
    }

    // Helper methods
    private void saveToFile(int index) throws IOException {
        String fileName = index + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(getQuestionContent());
            writer.newLine();
            writer.write(getCorrectAnswer());
            writer.newLine();
        }
    }

    private String readLineOrEmpty(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return line != null ? line : "";
    }

    // Legacy getters/setters for backward compatibility
    public String get_questionContent() {
        return getQuestionContent();
    }

    public void set_questionContent(String content) {
        setQuestionContent(content);
    }

    public String get_correctAnswer() {
        return getCorrectAnswer();
    }

    public void set_correctAnswer(String answer) {
        setCorrectAnswer(answer);
    }
}
