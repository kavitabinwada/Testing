package com.array;

import java.util.Scanner;

public class ArrPrac4 
{
	public static void main(String[] args) 
	{
		int[]t=new int[5];
		t[0]=9;
		t[1]=8;
		t[2]=6;
		t[3]=7;
		t[4]=8;
		t[5]=5;
		t[6]=2;
		
		for(int i=0;i<5;i++)
		{
			t[i]=i*10;
			System.out.println(t[i]);
		}
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value  : ");
			t[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(t[i]);
		}
		
				
		
	}
}
