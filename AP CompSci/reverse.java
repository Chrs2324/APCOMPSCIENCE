import java.util.Scanner;

public class reverse
{
	public static void main(String[] args)
	{
		int num = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("How many values: ");
		num = scan.nextInt();

		int array [] = new int [num];
		int reverseArray [] = new int [array.length];

		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter the value for " + (i + 1) + ": ");
			array[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("----------------");
		System.out.println("NUMBERS IN ORDER");
		System.out.println("----------------");
		System.out.println();

		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}


	}
}