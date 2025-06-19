package com.collection;

import java.util.ArrayList;

public class GenericsP4 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Default size is..."+al.size());
		System.out.println("Default value is..."+al);
		
		al.add(new Integer(100));
		al.add(new Integer(200));
		al.add(new Integer(300));
		System.out.println(al);
		
	}
}
