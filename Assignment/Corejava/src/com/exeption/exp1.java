package com.exeption;

import java.util.Scanner;

public class exp1 
{
	public static void main(String[] args) 
	{	
		try 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1: ");
		int a=sc.nextInt();
		System.out.println("Enter no2: ");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Your division is : "+c);
		System.out.println("Your program is completed");
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}	
	}
}
