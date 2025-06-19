package com.array;

import java.util.Scanner;

public class arrayp2 
{
	public static void main(String[] args) 
	{
		int[][]a=new int [3][3];
		int[][]b=new int [3][3];
		int[][]c=new int [3][3];
		Scanner sc= new Scanner(System.in);
		System.out.println("Now Start A Array.....");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.println(a[i][j]+"Enter value for A:    ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Now start a Array....");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the v alue B:   ");
				b[i][j]=sc.nextInt();	
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
