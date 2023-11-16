import java.io.IOException;

public interface IQuestion {
    public void display();

    public void enterData(int index) throws IOException;

    public void loadData(int index) throws IOException;
}
