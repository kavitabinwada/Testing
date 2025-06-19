package com.array;

import java.util.Scanner;

public class ArrPrac7 
{
	public static void main(String[] args)
	{
		int[]a= new int[5];
//		a[0]=76;
//		a[1]=80;
//		a[2]=90;
		
		for(int i=0;i<5;i++)
		{
			a[i]=i;
			System.out.println(a[i]);
		}
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the value....");
				a[i]=sc.nextInt();
			}
			for(int i=0;i<5;i++)
			{
				System.out.println(a[i]);
			}
		
	}
	//	System.out.println(a[0]);
	//	System.out.println(a[1]);
	//	System.out.println(a[2]);
		
	}

