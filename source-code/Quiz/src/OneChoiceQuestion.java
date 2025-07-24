import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class OneChoiceQuestion extends Question {
    // Constants for better maintainability
    private static final int NUMBER_OF_OPTIONS = 4;
    private static final char FIRST_OPTION_LABEL = 'A';
    private static final String SEPARATOR_LINE = "------------------------------";
    private static final String QUESTION_HEADER_LINE = "-------------------------------------------------";

    private String[] options;

    // Constructor
    public OneChoiceQuestion() {
        super();
        this.options = new String[NUMBER_OF_OPTIONS];
        Arrays.fill(options, "");
    }

    public OneChoiceQuestion(String questionContent, String correctAnswer, String[] options) {
        super(questionContent, correctAnswer);
        this.options = options != null && options.length == NUMBER_OF_OPTIONS
                ? Arrays.copyOf(options, NUMBER_OF_OPTIONS)
                : new String[NUMBER_OF_OPTIONS];
        if (this.options.length < NUMBER_OF_OPTIONS) {
            Arrays.fill(this.options, "");
        }
    }

    // Getters and Setters
    public String getOption(int index) {
        if (index >= 0 && index < options.length) {
            return options[index];
        }
        return "";
    }

    public void setOption(int index, String option) {
        if (index >= 0 && index < options.length) {
            this.options[index] = option != null ? option : "";
        }
    }

    public String[] getOptions() {
        return Arrays.copyOf(options, options.length);
    }

    public void setOptions(String[] options) {
        if (options != null && options.length == NUMBER_OF_OPTIONS) {
            this.options = Arrays.copyOf(options, NUMBER_OF_OPTIONS);
        } else {
            // Initialize with empty strings if invalid input
            this.options = new String[NUMBER_OF_OPTIONS];
            Arrays.fill(this.options, "");
        }
    }

    // Legacy getters/setters for backward compatibility
    public String get_option1() {
        return getOption(0);
    }

    public void set_option1(String option) {
        setOption(0, option);
    }

    public String get_option2() {
        return getOption(1);
    }

    public void set_option2(String option) {
        setOption(1, option);
    }

    public String get_option3() {
        return getOption(2);
    }

    public void set_option3(String option) {
        setOption(2, option);
    }

    public String get_option4() {
        return getOption(3);
    }

    public void set_option4(String option) {
        setOption(3, option);
    }

    // Legacy getters/setters for Question class
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

    @Override
    public boolean display() {
        displayQuestion();
        displayOptions();
        System.out.println(SEPARATOR_LINE);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            return isCorrectAnswer(userAnswer);
        }
    }

    /**
     * Displays the question content
     */
    private void displayQuestion() {
        String content = getQuestionContent();
        if (content != null && !content.trim().isEmpty()) {
            System.out.println(content);
        } else {
            System.out.println("[No question content]");
        }
    }

    /**
     * Displays all options with proper labels (A, B, C, D)
     */
    private void displayOptions() {
        for (int i = 0; i < options.length; i++) {
            char optionLabel = (char) (FIRST_OPTION_LABEL + i);
            String optionText = getOption(i);
            System.out.println(optionLabel + ": " + (optionText.isEmpty() ? "[Empty option]" : optionText));
        }
    }

    @Override
    public void enterData(int index) throws IOException {
        displayEnterDataHeader(index);

        try (Scanner scanner = new Scanner(System.in)) {
            // Get question content
            System.out.print("Enter question content: ");
            String questionInput = scanner.nextLine().trim();
            setQuestionContent(questionInput.isEmpty() ? "No question entered" : questionInput);

            // Get options with clear labels
            for (int i = 0; i < NUMBER_OF_OPTIONS; i++) {
                char optionLabel = (char) (FIRST_OPTION_LABEL + i);
                System.out.print("Enter option " + optionLabel + ": ");
                String optionInput = scanner.nextLine().trim();
                setOption(i, optionInput.isEmpty() ? "Option " + optionLabel : optionInput);
            }

            // Get correct answer with validation
            String answerInput;
            do {
                System.out.print("Correct answer (A, B, C, or D): ");
                answerInput = scanner.nextLine().trim().toUpperCase();
                if (isValidOptionLabel(answerInput)) {
                    setCorrectAnswer(answerInput);
                    break;
                } else {
                    System.out.println("Please enter a valid option (A, B, C, or D).");
                }
            } while (true);
        }

        // Save data to file
        saveToFile(index);
    }

    /**
     * Displays the header for data entry
     */
    private void displayEnterDataHeader(int index) {
        System.out.println(QUESTION_HEADER_LINE);
        System.out.println("ENTER QUESTION " + index);
        System.out.println(QUESTION_HEADER_LINE);
    }

    /**
     * Validates if the given string is a valid option label (A, B, C, D)
     */
    private boolean isValidOptionLabel(String answer) {
        if (answer == null || answer.length() != 1) {
            return false;
        }
        char c = answer.charAt(0);
        return c >= FIRST_OPTION_LABEL && c < (FIRST_OPTION_LABEL + NUMBER_OF_OPTIONS);
    }

    @Override
    public void loadData(int index) throws IOException {
        String fileName = index + ".txt";
        File file = new File(fileName);

        if (!file.exists()) {
            throw new IOException("Question file not found: " + fileName);
        }

        if (!file.canRead()) {
            throw new IOException("Cannot read question file: " + fileName);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            setQuestionContent(readLineOrEmpty(reader));

            for (int i = 0; i < NUMBER_OF_OPTIONS; i++) {
                setOption(i, readLineOrEmpty(reader));
            }

            setCorrectAnswer(readLineOrEmpty(reader));

            // Validate that we have valid data
            validateLoadedData();
        }
    }

    /**
     * Validates that the loaded data is complete and valid
     */
    private void validateLoadedData() throws IOException {
        if (getQuestionContent().trim().isEmpty()) {
            throw new IOException("Invalid data: Question content is empty");
        }

        boolean hasValidOptions = false;
        for (int i = 0; i < NUMBER_OF_OPTIONS; i++) {
            if (!getOption(i).trim().isEmpty()) {
                hasValidOptions = true;
                break;
            }
        }

        if (!hasValidOptions) {
            throw new IOException("Invalid data: All options are empty");
        }

        if (!isValidOptionLabel(getCorrectAnswer())) {
            throw new IOException("Invalid data: Correct answer must be A, B, C, or D");
        }
    }

    // Helper methods
    private void saveToFile(int index) throws IOException {
        String fileName = index + ".txt";

        // Validate data before saving
        validateDataBeforeSaving();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(getQuestionContent());
            writer.newLine();

            for (String option : options) {
                writer.write(option != null ? option : "");
                writer.newLine();
            }

            writer.write(getCorrectAnswer());
            writer.newLine();

            // Ensure data is written to disk
            writer.flush();
        }
    }

    /**
     * Validates data before saving to ensure integrity
     */
    private void validateDataBeforeSaving() throws IOException {
        if (getQuestionContent() == null || getQuestionContent().trim().isEmpty()) {
            throw new IOException("Cannot save: Question content is empty");
        }

        if (getCorrectAnswer() == null || !isValidOptionLabel(getCorrectAnswer())) {
            throw new IOException("Cannot save: Invalid correct answer. Must be A, B, C, or D");
        }
    }

    private String readLineOrEmpty(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return line != null ? line : "";
    }

    /**
     * Returns the index of the correct answer option (0-3)
     * 
     * @return index of correct answer, or -1 if invalid
     */
    public int getCorrectAnswerIndex() {
        String answer = getCorrectAnswer();
        if (isValidOptionLabel(answer)) {
            return answer.charAt(0) - FIRST_OPTION_LABEL;
        }
        return -1;
    }

    /**
     * Gets the text of the correct answer option
     * 
     * @return the text of the correct option, or empty string if invalid
     */
    public String getCorrectAnswerText() {
        int index = getCorrectAnswerIndex();
        return index >= 0 ? getOption(index) : "";
    }

    /**
     * Checks if all options have been filled
     * 
     * @return true if all options have non-empty text
     */
    public boolean areAllOptionsFilled() {
        for (String option : options) {
            if (option == null || option.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns a string representation of this question for debugging
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OneChoiceQuestion{")
                .append("questionContent='").append(getQuestionContent()).append('\'')
                .append(", options=").append(Arrays.toString(options))
                .append(", correctAnswer='").append(getCorrectAnswer()).append('\'')
                .append('}');
        return sb.toString();
    }

}
