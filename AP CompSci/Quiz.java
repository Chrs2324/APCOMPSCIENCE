import java.util.Scanner;

public class Quiz
{
	public static void main(String[] args)
	{

		int key = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("How many questions on the quiz? ");
		int questions = scan.nextInt();

		while (questions > 0)
		{
			System.out.print("Enter the key for the quiz: ");
			key = scan.nextInt();
		}

		int number[][] = new int [questions + 1][key + 1];

		for (int i = 1; i < number.length; i++)
		{
			System.out.println("Enter each correct answer: ");
			number[i][key] = scan.nextInt();
		}
	}
}
