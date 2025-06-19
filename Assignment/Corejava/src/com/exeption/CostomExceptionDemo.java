package com.exeption;

import java.util.Scanner;

class NoPaisaException extends Exception
{
	double amount;
	NoPaisaException(double amount)
    {
		this.amount=amount;	
	}	
}
class ATM
{
	double balance;
	public  void deposit(double amount) 
	{
		balance += amount;
		System.out.println(amount+"rs diposited...");
	}
	public void withdrawal(double amount) throws NoPaisaException
	{
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println(amount+"rs withdrwal successfully");
		}
		else
		{
			double needs =amount-balance;
			throw new NoPaisaException(needs);
			
		}
	}
}
public class CostomExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ATM a1=new ATM(); 
		
		System.out.println("Enter amount for deposite:  ");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
		System.out.println("Enter amount for withdrawal: ");
		amount=sc.nextDouble();
		try 
		{
			a1.withdrawal(amount);
		}catch(NoPaisaException e)
		{
		System.out.println("If you enter "+e.amount+"rs more into your account then you withdrWl"+amount+"rs");
			
		}
			
	}
}
