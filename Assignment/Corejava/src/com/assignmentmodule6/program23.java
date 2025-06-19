//WAP to reverse an array of integer values.
package com.assignmentmodule6;

import java.util.Arrays;

public class program23 
{
	public static void main(String[] args) 
	{
		int[]array = {1,2,3,4,5};
		
		System.out.println("Original array:  "+Arrays.toString(array));
	
	
		for(int i=4;i>=0;i--)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Reverse array:   "+Arrays.toString(array));
	}
}