// ****************************************************************
//   Payroll.java
//
//   Represents a list of employees.
// ****************************************************************

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Payroll
{
    final int MAX = 30;
    Employee[] payroll = new Employee[MAX];
    int numEmployees = 0;


    // ---------------------------------------------------------
    //  Reads the list of employee wage data from the given
    //  file.
    // ---------------------------------------------------------
    public void readPayrollInfo(String file)
    {

	String line;
	String name;
	double rate;
	int hours;

	Scanner fileScan, lineScan;

	try
	    {
		fileScan = new Scanner (new File(file));

		while (fileScan.hasNext())
		    {
			line = fileScan.nextLine();

			lineScan = new Scanner(line);
			name = lineScan.next();
			try
			    {
				hours = lineScan.nextInt();
				rate = lineScan.nextDouble();
				payroll[numEmployees] = new Employee (name, hours, rate);
				numEmployees++;
			    }
			catch (InputMismatchException exception)
			    {
				System.out.println ("Error in input. Line ignored.");
				System.out.println (line);
			    }
			catch (ArrayIndexOutOfBoundsException exception)
			    {
				System.out.println ("Too many employees!");
			    }
		    }
		fileScan.close();

	    }
	catch (FileNotFoundException exception)
	    {
		System.out.println ("The file " + file + " was not found.");
	    }

    }


    // ------------------------------------------
    //   Returns the number of employees who
    //   worked over 40 hours; the helper method
    //   overtime is called to do all the work.
    // ------------------------------------------
    public int numOvertime ()
    {
	return overtime (0);
    }


    // ------------------------------------------------
    //   Returns the number of employees in the part
    //   of the list from index start to the end who
    //   worked more than 40 hours.
    // ------------------------------------------------
    public int overtime (int start)
    {
		if (start >= numEmployees)
		{
			return 0;
		}
		else if (payroll[start].getHours() > 40)
		{
			return 1 + overtime (start+1);
		}
		else
		{
			return overtime (start+1);
		}
	}
}
