import java.util.Scanner;

public class Average
{
	public static void main(String[] args)
	{
		double sum = 0;

		for (int i = 0; i < args.length; i++)
		{
			 sum += args.length;
		}
		if (args.length > 0)
		{
			System.out.println("Average of arguments: " + sum);
		}
		else
		{
			System.out.println("");
		}
	}
}