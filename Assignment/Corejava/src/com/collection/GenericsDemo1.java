package com.collection;

import java.util.ArrayList;

public class GenericsDemo1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> aa=new ArrayList<Integer>();
		System.out.println("Default Size is..."+aa.size());
		System.out.println("Default Value is..."+aa);
		
		aa.add(987);
		aa.add(new Integer(100));
		
		System.out.println(aa);
		
	}
}
