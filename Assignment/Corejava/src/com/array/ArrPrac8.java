package com.array;

public class ArrPrac8 
{
	public static void main(String[] args) 
	{
		int[][] a=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;i++)
			{
				a[i][j]=i;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
