//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.Scanner;

public class Parameters
{
    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args)
    {
	double mean1, mean2;

	Scanner scan = new Scanner (System.in);

	mean1 = average();
	mean2 = average();

	System.out.print("How many integers for mean1? ");
	int questions = scan.nextInt();
	System.out.print("How many integers for mean2? ");
	int questions2 = scan.nextInt();

	for (int i = 0; i < questions; i++)
	{
		System.out.print("Enter a number for mean1: ");
		mean1 = scan.nextInt();

		mean1 += mean1 / questions;
	}


	for (int i = 0; i < questions2; i++)
	{
		System.out.print("Enter a number for mean2: ");
		mean2 = scan.nextInt();

		mean2 += mean2 / questions2;
	}

	System.out.println ("mean1 = " + mean1);
	System.out.println ("mean2 = " + mean2);
	System.out.println ("minimum = " + minimum());

	}
    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average (int ... list)
    {
	double result = 0.0;

	if (list.length != 0)
	    {
		int sum = 0;
		for (int num: list)
		    sum += num;
		result = (double)sum / list.length;
	    }

	return result;
    }

    //-----------------------------------------
    // Returns the minimum of its parameters.
    //-----------------------------------------
	public static int minimum (int ... list)
	{
		int lowestNum = 200000;
		System.out.println(list.length);
		for (int i:list)
		{	System.out.println(i);
			lowestNum = (lowestNum > list[i])?list[i]:lowestNum;
		}
		return lowestNum;
	}
}

