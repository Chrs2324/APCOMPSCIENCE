import java.util.Scanner;

public class WriteTest
{
	public static void main(String[] args)
	{

		TestQuestion[] questions;
		TestQuestion q, temp;
		int count, foobar;
		String b, t;

		Scanner scan = new Scanner(System.in);

		System.out.print("Number of Choices: ");
		count = scan.nextInt();
		System.out.print("Type in anything: ");
		b = scan.nextLine();

		for (int i = 0; i < count; i++)
		{
			b = scan.nextLine();
			foobar = scan.nextInt();
			t = scan.nextLine();
			if (b.equals("e"))
			{
				q = new Essay();
			}
			else if (b.equals("m"))
			{
				q = new MultChoice();
			}
			q.readQuestion();
			questions[i] = q;
		}
	}
}