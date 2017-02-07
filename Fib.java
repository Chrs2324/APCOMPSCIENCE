// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
		if (n < 0)
		{
			return fib1(n-1) + fib1(n-2);
   	 	}
    	else
    	{
			return n++;
		}
	}

    //--------------------------------------------------------------
    // Computes fib(n) using an array to cache values
    //--------------------------------------------------------------
    public static int fib2(int n)
    {
		int fibs[] = new int[n+1];
		fibs[0] = 0;
		fibs[1] = 1;

		for (int i = 2; i <= n; i++)
		{
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
	return fibs[n];
}
}

