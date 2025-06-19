package com.array;

import java.util.Scanner;

public class ArrPrac3 
{
	public static void main(String[] args) 
	{
		int[]no=new int[5];
		no[0]=6;
		no[1]=5;
		no[2]=8;
		no[3]=5;
		no[4]=9;
		System.out.println("First number of value is .."+no[0]);
		System.out.println("Second number of value is .. "+no[1]);
		System.out.println("Third number of value is .."+no[2]);
		System.out.println("Forth number of vzlue is .."+no[3]);
		System.out.println("Fifth number of value is .."+no[4]);
		
		for(int i=0;i<5;i++)
		{
			no[i]=i;
			System.out.println(no[i]);
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter your value : ");
			no[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(no[i]);
		}
			
	}
}
