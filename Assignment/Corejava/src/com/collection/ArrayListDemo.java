package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();
		System.out.println("Default Size is..."+a1.size());
		System.out.println("Defalt value is..."+a1);
		a1.add(456);
		a1.add('K');
		a1.add("Rahul");
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.add("Kavi");
		a1.add(new Integer(100));
		System.out.println("Default size is ..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.addFirst(987);
		System.out.println("Default size is..."+a1);
		System.out.println("Now value is..."+a1);
		a1.addLast("Kavita");
		System.out.println("Default size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.remove(4);
		System.out.println("Default size is..."+a1.size());
		System.out.println("now value is..."+a1);
		a1.remove(5);
		System.out.println("Default size is..."+a1.size());
		System.out.println("now value is..."+a1);
		a1.remove("Rahul");
		System.out.println("Now value is..."+a1);
		a1.removeFirst();
		System.out.println("Now size is..."+a1.size());
		System.out.println("now value is..."+a1);
		a1.removeLast();
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.add(new Integer(5000));
		a1.add(new Integer(6000));
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is..."+a1);
		a1.add(7000);
		System.out.println("Now size is..."+a1.size());
		System.out.println("Now value is ..."+a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext());
		{
			System.out.println(i1.next());
			
		}	
	}
}
