//WAP to update specific array element by given element
package com.assignmentmodule6;

public class program20 
{
	public static void main(String[] args) 
	{
		String [] mycolor= {"red","purple","blue","yellow"};
		
		System.out.println("this is the original array");
		for(String colors:mycolor)
		{
			System.out.println(mycolor+ " ");
		}
		System.out.println();
		
		mycolor[2]="White";
		
		System.out.println("Updated array...");
		for(String color:mycolor)
		{
			System.out.println(color+ " ");
		}
			
	}
}
