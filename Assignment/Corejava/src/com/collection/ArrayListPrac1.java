package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrac1 
{
	public static void main(String[] args) 
	{
		ArrayList aa=new ArrayList();
		System.out.println("Default Size is..."+aa.size());
		System.out.println("Default value is.."+aa);
		aa.add(234);
		aa.addFirst("Kavita");
		System.out.println("Default size is..."+aa.size());
		System.out.println("Defaul value is...."+aa);
		aa.addLast("Ami");
		System.out.println("Default size is..."+aa.size());
		System.out.println("Default value is..."+aa);
		aa.add(new Integer(200));
		
		Iterator ii=aa.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
	}
}
