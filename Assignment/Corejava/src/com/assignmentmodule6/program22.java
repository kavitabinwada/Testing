//WAP to Copy one array into another
package com.assignmentmodule6;

import java.util.Arrays;

public class program22 
{
	public static void main(String[] args) 
	{
		int[]myarray= {4,3,5,6,2};
		int[]copyarray= new int[myarray.length];
		
		for(int i=0;i<myarray.length;i++)
		{
			copyarray[i]=myarray[i];
		}
		System.out.println("My array..."+Arrays.toString(myarray));
		System.out.println("copy array..."+Arrays.toString(copyarray));
	}
}
