package com.exeption;

import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter No1 :");
		 int a=sc.nextInt();
		 System.out.println("Enter No2 :");
		 int b=sc.nextInt();
		 int c=a/b;
		 System.out.println("Your Division is.."+c);
		 System.out.println("Your Program is completed...");
		}catch(Exception e) 
		{
			e.printStackTrace();	
		}
		finally
		{
			System.out.println("Hi I am Kavi,I want to say you nice to meet you..");
		}
	}
}
