import java.util.Scanner;

public abstract class TestQuestion
{
	protected String question;

	protected String answer;

	protected abstract void readQuestion(Scanner scan);

	public abstract String toString();
}
