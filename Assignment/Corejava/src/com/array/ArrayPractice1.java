package com.array;

import java.util.Scanner;

public class ArrayPractice1 
{
	public static void main(String[] args) 
	{
		int[] a=new int[5];//store in 0 to 4
		
		a[0]=10;
		a[1]=20;
		
		for(int i=0;i<5;i++)
		{
			a[i]=i*10;
			System.out.println(a[i]);
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=10;i++) 
		{
			System.out.println("Enter value:  ");
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<5;i++) 
		{
			System.out.println(a[i]);
		}
	}
}
