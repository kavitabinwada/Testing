package com.assignmentmodule6;

import java.util.Scanner;

class CostomException extends Exception
{
	double amount;
	
	public  CostomException(double amount)
	{
		this.amount=amount;
	}	
}
class ATM{
	
	double balance;
	public void deposite(double amount) 
	{
		balance=+amount;
		System.out.println("Rs deposited..."+amount);
		
	}
	public void withDrawl(double amount) throws CostomException
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("amount withDrawl successfully..."+amount);
		}
		else 
		{
			double needs=amount-balance;
			
			throw new CostomException(needs);
		}
	}
}

public class program27 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ATM a1=new ATM();
		
		System.out.println("Enter amount for deposite...");
		double amount=sc.nextDouble();
		a1.deposite(amount);
		
		System.out.println("Enter amount for withdrawl...");
		 amount=sc.nextDouble();
		try {
			a1.withDrawl(amount);
		} catch (CostomException e) {
			
		System.out.println("Sorry insufficient balance....");
		}
		
		
	}
}
