package exceptions;

import java.util.Scanner;

/*
 * Custom Exceptions : To create a user-defined exception, you need to extends the Exception class.
 * 
 * 
 */

class InsufficientFunds extends Exception{
	
	double amount;

	public InsufficientFunds(double amount) {		
		this.amount = amount;
	}
	
	double getAmount()
	{
		return this.amount;
	}
	
}


class checkingAccount {
	
	long accno;
	double balance=0;
	
	public checkingAccount(long accno) {		
		this.accno = accno;
		System.out.println("Acount Number : "+this.accno);
	}
	
	
	void deposit(double amt)
	{
		this.balance = this.balance + amt;
	}
	
	void withdraw(double amt) throws InsufficientFunds
	{
		if(amt<=this.balance)
		{
			this.balance = this.balance - amt;
		}
		else
		{
			double needs = amt - this.balance;
			throw new InsufficientFunds(needs);
		}
		
	}
	
	
	void checkBalance()
	{
		System.out.println("Current Balance : "+this.balance);
	}
	
	
	
}



public class BankDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No. : ");
		long accno = sc.nextLong();
		checkingAccount ca = new checkingAccount(accno);
		ca.checkBalance();
		
		
		// Depositing
		System.out.print("\nEnter Amount to Deposit : ");
		double amt = sc.nextDouble();
		ca.deposit(amt);
		ca.checkBalance();
		
		//Withdraw
		try {
			System.out.print("\nEnter Amount to Withdraw : ");
			amt = sc.nextDouble();			
			ca.withdraw(amt);
			ca.checkBalance();
			System.out.println("Withdrawal is successful.");
		} catch (InsufficientFunds e) {
			// TODO Auto-generated catch block
			
			System.out.println("Sorry you need Rs."+e.getAmount()+" to withdraw.");
			//e.printStackTrace();
		}
		
		
	}

}
