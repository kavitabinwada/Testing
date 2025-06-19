package com.collection;

import java.util.ArrayList;

public class GenericsP1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("Default size is..."+a1.size());
		System.out.println("Default value is..."+a1);
		
		a1.add(100);
		a1.add(new Integer(6));
		
	}
}
