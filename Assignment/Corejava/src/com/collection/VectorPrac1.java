package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorPrac1 
{
	public static void main(String[] args)
	{
		Vector vv=new Vector(2);
		System.out.println("Default size is..."+vv.size());
		System.out.println("Default capacity is..."+vv.capacity());
		System.out.println("Default value is..."+vv);
		vv.add(789);
		System.out.println("Default value is... "+vv);
		System.out.println("Default capacity is..."+vv.capacity());
		System.out.println("Default size is..."+vv.size());
		vv.add(45);
		vv.add(new Integer(100));
		System.out.println("Default value is... "+vv);
		System.out.println("Default capacity is..."+vv.capacity());
		System.out.println("Default size is..."+vv.size());
		
		Iterator ii=vv.iterator();
		
		
		
	}
}
