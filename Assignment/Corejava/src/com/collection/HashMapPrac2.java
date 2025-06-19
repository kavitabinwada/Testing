package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPrac2 
{
	public static void main(String[] args) 
	{
		HashMap hh=new HashMap();
		System.out.println("Default size is..."+hh.size());
		System.out.println("Default value is..."+hh);
		
		hh.put(1, 89);
		hh.put(5,10);
		hh.put(8, 11);
		hh.put(10,100);
		hh.put("Patel","Amit");
		hh.put("Patel","Ami");
		hh.put("Misha","Patel");
		hh.put(10,100);
		System.out.println("Default size is..."+hh.size());
		System.out.println("Default value is..."+hh);
		hh.remove(8,11);
		System.out.println("Default size is..."+hh.size());
		System.out.println("Default value is..."+hh);
		
		Set set=hh.entrySet();
		Iterator ii=set.iterator();
		while(ii.hasNext())
		{
			Map.Entry mm=(Map.Entry)ii.next();
			System.out.println("Key is..."+mm.getKey());
			System.out.println("Value is..."+mm.getValue());
		}
		
		
	}
}
