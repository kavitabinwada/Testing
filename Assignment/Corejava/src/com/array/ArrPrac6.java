package com.array;

public class ArrPrac6 
{
	public static void main(String[] args) 
	{
		int[][]no=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Enter your value..");
				no[i][j]=j;
				System.out.println(no[i][j]);
			}
		}
		System.out.println();
		
	}
}
