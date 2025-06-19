package com.assignmentmodule6;

import java.util.Scanner;

public class program5 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number:   ");
		int num=scanner.nextInt();
		
		int rem, sum=0;
		int n=num;
		
		while(num>0)
		{
			rem=num%10;  		// 153  15.3  1.5
			sum=sum+(rem*rem*rem);    // 
			num=num/10;  // 15.3  15
		}
		
		if(sum==n)
		{
			System.out.println("this is the armstron number"+num);
		}
		else
		{
			System.out.println("this is not a armstron number"+num);
		}
	}
	
}
