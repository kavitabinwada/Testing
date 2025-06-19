package com.assignmentmodule6;

import java.util.Scanner;

public class program6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number :- ");
		int num=sc.nextInt();
		
		int a=0;int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=num;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
}
