package com.assignmentmodule6;

public class program7_5 
{
	public static void main(String[] args) 
	{
		int a=3;
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<a;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=(2*i-1); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
				
		}
		for(int i=a-1;i>=1;i--)
		{
			for(int j=a;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print(" *");
			}
			System.out.println();
				
		}
	}
}
