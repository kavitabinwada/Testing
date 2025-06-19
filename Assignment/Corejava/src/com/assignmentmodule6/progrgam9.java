//WAP to sum values of an array

package com.assignmentmodule6;

import java.util.Scanner;

public class progrgam9 
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
		
		
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of array :-"+sum);
		
	}
}
