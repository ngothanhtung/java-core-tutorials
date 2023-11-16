public abstract class Question implements IQuestion {
    private String _questionContent;
    private String _correctAnswer;

    public String get_questionContent() {
        return _questionContent;
    }

    public void set_questionContent(String _questionContent) {
        this._questionContent = _questionContent;
    }

    public String get_correctAnswer() {
        return _correctAnswer;
    }

    public void set_correctAnswer(String _correctAnswer) {
        this._correctAnswer = _correctAnswer;
    }

    public abstract boolean display();

    public abstract void enterData(int index);

    public abstract void loadData(int index);
}
