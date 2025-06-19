package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo 
{
	public static void main(String[] args) 
	{
		HashSet h1=new HashSet();
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default value is..."+h1);
		
		h1.add(234);
		h1.add('K');
		h1.add("Kavi");
		h1.add(45.65f);
		h1.add(new Integer(200));
		h1.add("kavita");
		System.out.println("Now size is..."+h1.size());
		System.out.println("now value is..."+h1);
		h1.remove("Kavi");
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is..."+h1);
		h1.add("Kavi");
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default value is..."+h1);
		h1.remove("Kavi");
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is..."+h1);
		
		Iterator ii=h1.iterator();
		while(ii.hasNext());
		{
			System.out.println(ii.next());
		}
		
	}
}
