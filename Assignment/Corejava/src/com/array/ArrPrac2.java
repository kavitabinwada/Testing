package com.array;

import java.util.Scanner;

public class ArrPrac2 
{
	public static void main(String[] args) 
	{
		int[]myNumber = new int[5];
		myNumber[0]=98;
		myNumber[1]=89;
		myNumber[2]=98;
		myNumber[3]=99;
		myNumber[4]=97;
		System.out.println("myNumber is ..."+myNumber[0]);
		System.out.println("myNumber is ..."+myNumber[1]);
		System.out.println("myNumber is ..."+myNumber[2]);
		System.out.println("myNumber is ..."+myNumber[3]);
		System.out.println("myNumber is ..."+myNumber[4]);
		for(int i=0;i<5;i++)
		{
			myNumber[i]=i;
			System.out.println(myNumber[i]);
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value :  ");
			myNumber[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(myNumber[i]);
		}
	}
}
