//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw,
// and check the balance.
//*******************************************************

public class Account
{
    private double balance;
    private String name;
    private long acctNum;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public boolean withdraw(double amount)
  {
    if (balance >= amount)
    {
       balance -= amount;
       return true;
    }
   	 	else
    	{
    	   System.out.println("Insufficient funds");
    	   return false;
   		}
   }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }

  //----------------------------------------------
  // Returns a string containing the name, acct number, and balance.
  //----------------------------------------------
    public String toString()
    {
	return "Name: " + name +
	    "\nAcct #: " + acctNum +
	    "\nBalance: " + balance;
    }

  //----------------------------------------------
  // Transfers amount from the current account to the passed account.
  //----------------------------------------------
	public void transfer(Account acct, double amount)
	{
		if (balance < amount)
		{
			System.out.println("You don't have enough money.");
		}
		else
		{
			System.out.println(acct);
		}
	}


  //----------------------------------------------
  // Transfers amount from acct1 to acct2
  //----------------------------------------------
  public static void transfer(Account acct1, Account acct2, double amount)
  {
      if (acct1.balance >= amount)
	  {
	      acct1.withdraw(amount);
	      acct2.deposit(amount);
	  }
      else
       System.out.println("Insufficient funds for transfer");
  }



}
