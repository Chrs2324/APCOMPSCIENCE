// *******************************************************************
//   DigitPlay.java
//
//   Finds the number of digits in a positive integer.
// *******************************************************************

import java.util.Scanner;

public class DigitPlay
{
    public static void main (String[] args)
    {
	int num;    //a number

	Scanner scan = new Scanner (System.in);

	System.out.println ();
	System.out.print ("Please enter the identification number: ");
	num = scan.nextInt ();

	if (num <= 0)
	{
	    System.out.println ( num + " isn't positive -- start over!!");
	}
 	if (0 != num % 7)
	{
		System.out.println (num + " isn't divisible by 7 -- start over!!");
	}
	else
	    // Call numDigits to find the number of digits in the number
		// Print the number returned from numDigits
		System.out.println ("\nThe number " + num + " contains " + sumDigits (num) + " digits.");
		System.out.println ();
    }


    // -----------------------------------------------------------
    //  Recursively sums the digits in a positive integer
    // -----------------------------------------------------------
    public static int sumDigits(int num)
    {
	if (num < 10)
	    return (1);
	else
	    return (1 + sumDigits(num/10));
    }
}



