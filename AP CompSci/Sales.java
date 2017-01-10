// ****************************************************************************
// Sales.java
//
// Reads in and stores sales for each of any number of salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************************
import java.util.Scanner;

public class Sales
{
    public static void main(String[] args)
    {
	int sum;
	int personMax = 0;
	int personMin = 0;
	double average = 0.00;
	int maximum = 0;
	int minimum = Integer.MAX_VALUE;

	Scanner scan = new Scanner (System.in);

	System.out.print("Enter the number of sales people: ");
	int people = scan.nextInt();

	int sales[] = new int[people + 1];

	for (int i=1; i < sales.length; i++)
	{
		System.out.print("Enter sales for salesperson " + i + ": ");
		sales[i] = scan.nextInt();
	}

	System.out.println("\nSalesperson   Sales");
	System.out.println("--------------------");
	sum = 0;

	for (int i=1; i<sales.length; i++)
	    {
		System.out.println("     " + i + "\t\t" + sales[i]);
		sum += sales[i];
		average = sum / people;

		if (sales[i] > maximum)
		{
			maximum = sales[i];
			personMax = i;
		}
		else if (sales[i] < maximum)
		{
			minimum = sales[i];
			personMin = i;
		}
		else
		{
			System.out.println();
		}
	}
	System.out.println("\nTotal sales: " + sum);
	System.out.println("Average: " + average);
	System.out.println("Maximum Sales: " + maximum + " Sales person: " + (personMax));
	System.out.println("Minimum Sales: " + minimum + " Sales person: " +(personMin));
	System.out.println();
	System.out.print("Enter a number: ");
	int num = scan.nextInt();

	for (int i = 1; i < sales.length; i++)
	{
		if (sales[i] > num)
		{
			System.out.println("Sales person: " + i + " Amount: " + sales[i]);
		}
	}
}
}



