import java.util.Scanner;

public class TransferTest
{
	public static void main (String[] args)
	{
		Account acct1, acct2;
		String name = "";
		double balance = 0;
		long acctNum = 0;
		String transfer = "";
		double amount = 0.0;

		Scanner scan = new Scanner (System.in);

		acct1 = new Account (balance,name,acctNum);
		acct2 = new Account (balance,name,acctNum);

		do
		{
			System.out.print("Do you want to transfer accounts? (y or n): ");
			transfer = scan.next();

			if (transfer = "y")
			{
				System.out.print("How much do you want to transfer? ");
				amount = scan.nextDouble();

				acct1.transfer(acct2,amount);

				System.out.println(acct1);
				System.out.println(acct2);
			}
			else
			{


	}
}



