package com.assignmentmodule6;

public class program7_4 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
