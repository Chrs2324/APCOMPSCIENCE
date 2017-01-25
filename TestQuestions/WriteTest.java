import java.util.Scanner;

public class WriteTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int numQ;
		TestQuestion[] questions;
		numQ = scan.nextInt();
		questions = new TestQuestion[numQ];

		for (int i = 0; i < questions.length; i++)
		{
			String answer = scan.next();

			switch (answer)
			{
				case "e":
					questions[i] = new MultChoice();
					questions[i].readQuestion(scan);
				break;


				case "m":
					questions[i] = new MultChoice();
					questions[i].readQuestion(scan);
				break;
			}
		}
	}
}