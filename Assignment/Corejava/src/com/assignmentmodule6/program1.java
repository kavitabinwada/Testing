package com.assignmentmodule6;
// W.A.J.P to Take three numbers from the user and print the greatest
//number.

import java.util.Scanner;

public class program1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enten your first number...");
		int no1 = sc.nextInt();
		System.out.println("Enten your second number...");
		int no2 = sc.nextInt();
		System.out.println("Enten your third number...");
		int no3 = sc.nextInt();
		if(no1>no2&&no1>no3) 
		{
			System.out.println("first number is greater number");
		}
		else if(no2>no1&&no2>no3)
		{
			System.out.println("second number is greater number");
		}
		else
		{
			System.out.println("third number is greater number");
		}

	}
}
