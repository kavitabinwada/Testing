package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac1
{
	public static void main(String[] args) 
	{
		HashSet hh=new HashSet();
		System.out.println("Default size is.."+hh.size());
		System.out.println("Default value is.."+hh);
		hh.add(234);
		hh.add('Z');
		hh.add("Zassss");
		hh.add(45.65f);
		hh.add(new Integer(78));
		hh.add(new Integer(777));
		System.out.println("Now Size is ..."+hh.size());
		System.out.println("Now Value is..."+hh);
		hh.add("kavita");
		hh.add(99);
		System.out.println("Now Size is..."+hh.size());
		System.out.println("Now Value is..."+hh);
		hh.remove("Zassss");
		System.out.println("Now Size is ..."+hh.size());
		System.out.println("Now value is ..."+hh);
		
		Iterator ii=hh.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
	}
	
}
