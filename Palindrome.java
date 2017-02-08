import java.util.Scanner;

public class Palindrome
{

	private static boolean palindrome(String s)
	{
		if (s.length() == 0 || s.length() == 1)
		{
			return true;
		}

		if (s.charAt(0) == s.charAt(s.length()-1))
		{
			return palindrome(s.substring(1, s.length()-1));
		}
		return false;
	}



	public static void main(String[] args)
	{
		String s;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a palindrome: ");
		s = scan.nextLine();

		System.out.println(palindrome (s));

		if (palindrome (s))
		{
			System.out.println("The string is a palindrome!");
		}
		else
		{
			System.out.println("The string is not a palindrome!");
		}
	}
}



