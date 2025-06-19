package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default value is..."+h1);
		h1.put("Kavi","Patel");
		h1.put(1,"Kavita");
		h1.put(45.65f,'K');
		h1.put(9,"Avi");
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is..."+h1);
		h1.remove(45.65f);
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is..."+h1);
		
		
		Set set=h1.entrySet();
		Iterator i1=set.iterator();
		
	//	while(i1.hasNext())
	//	{
	//		System.out.println(i1.next());
	//	}
		while(i1.hasNext()) 
		{
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("Key is.."+me.getKey());
			System.out.println("Value is.."+me.getValue());
		}
		
	}
}
