package com.assignmentmodule6;

import java.util.Scanner;

public class program11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		

		int[] arr=new int[5];
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter element of array :- ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("element of array :- "+arr[i]);
			
		}
	}
}
