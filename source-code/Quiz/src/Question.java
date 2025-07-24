import java.io.IOException;

public abstract class Question implements IQuestion {
    protected String questionContent;
    protected String correctAnswer;

    // Constructor
    public Question() {
        this.questionContent = "";
        this.correctAnswer = "";
    }

    public Question(String questionContent, String correctAnswer) {
        this.questionContent = questionContent;
        this.correctAnswer = correctAnswer;
    }

    // Getters and Setters with proper Java naming convention
    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent != null ? questionContent : "";
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer != null ? correctAnswer : "";
    }

    // Abstract methods
    @Override
    public abstract boolean display();

    @Override
    public abstract void enterData(int index) throws IOException;

    @Override
    public abstract void loadData(int index) throws IOException;

    // Helper method to check if answer is correct
    protected boolean isCorrectAnswer(String userAnswer) {
        if (userAnswer == null || correctAnswer == null) {
            return false;
        }
        return correctAnswer.trim().equalsIgnoreCase(userAnswer.trim());
    }
}
