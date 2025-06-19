package com.array;

public class ArrPrac5 
{
	public static void main(String[] args) 
	{
		int[][]a = new int[3][3];

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				//System.out.println("Enter value : 	 ");
				a[i][j]=j+1;
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
