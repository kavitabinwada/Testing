//WAP to iterate through all elements in an array list.
package com.assignmentmodule6;

import java.util.ArrayList;
import java.util.Iterator;

public class program19 
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits= new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("banana");
		fruits.add("Orange");
		
		for(String fruit : fruits)
		{
			System.out.println(fruits);
		}
		
		System.out.println("Iterating using Iterator:");
		Iterator<String> Iterator=fruits.iterator();
		while(Iterator.hasNext())
		{
			System.out.println(Iterator.next());
		}
			
	}
}
 