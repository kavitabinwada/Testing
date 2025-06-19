//WAP to demonstrate try catch block.
package com.assignmentmodule6;

public class program15 
{
	public static void main(String[] args) 
	{
		try
		{
			int[] num= {1,2,3};
			System.out.println(num[5]);
		}
		catch(Exception e)
		{
			System.out.println("This is the Exception");
		}
	}
}
