package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapPrac1 
{
	public static void main(String[] args)
	{
		HashMap hh= new HashMap();
		System.out.println("Default size is..."+hh.size());
		System.out.println("Default value is..."+hh);
		
		hh.put(1,"Ashmi");
		hh.put(2,"Angel");
		hh.put(3,"Krishnavi");
		hh.put(4,"Dhani");
		hh.put("Patel","Kavita");
		hh.put(5,"Ashmi");
		hh.put(6,"Angel");
		hh.put(1, "Ami");
		hh.put(8,"Arya");
		System.out.println("Now size is..."+hh.size());
		System.out.println("Now value is..."+hh);
		hh.remove(4);
		System.out.println("Now size is..."+hh.size());
		System.out.println("Now value is..."+hh);
		hh.remove(3);
		System.out.println("Now size is..."+hh.size());
		System.out.println("Now value is..."+hh);
		
		
		Set set=hh.entrySet();
		
		Iterator ii=set.iterator();
		
		while(ii.hasNext())
		{
			Map.Entry ME=(Map.Entry)ii.next();
			System.out.println("Key is..."+ME.getKey());
			System.out.println("Value is..."+ME.getValue());
			
	}
  }
}
