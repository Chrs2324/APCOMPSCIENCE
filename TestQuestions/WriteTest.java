import java.util.Scanner;

public class WriteTest
{
	public static void main(String[] args)
	{
		int count = 0;
		TestQuestion[] questions = new TestQuestion[count];
		TestQuestion q;
		String t;

		Scanner scan = new Scanner(System.in);

		count = scan.nextInt();
		String b = scan.nextLine();

		for (int i = 0; i < count; i++)
		{
			b = scan.nextLine();
			int foobar = scan.nextInt();
			t = scan.nextLine();
			if (b.equals("e"))
			{
				Essay temp = new Essay();
			}
			else if (b.equals("m"))
			{
				MultChoice temp = new MultChoice();
			}
			temp.readQuestion();
			questions[i] = temp;
		}
	}
}