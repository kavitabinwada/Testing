//WAP to remove the third element from a array list.
package com.assignmentmodule6;

import java.util.ArrayList;

public class program21 
{
	public static void main(String[] args)
	{
		ArrayList<String>mylist=new ArrayList<String>();
		mylist.add("banana");
		mylist.add("mango");
		mylist.add("apple");
		
		System.out.println("This is the original list"+mylist);
		
		mylist.remove(2);
		System.out.println("This is the updated list"+mylist);
	}
}
