package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
  public static void main(String[] args) 
  {
	  Vector v1=new Vector(3,1);
	  System.out.println("Default size is..."+v1.size());
	  System.out.println("Default Capacity is..."+v1.capacity());
	  System.out.println("Default value is..."+v1);
	  
	  v1.add(567);
	  v1.addElement("Rahul");
	  v1.add('R');
	  System.out.println("Now size is..."+v1.size());
	  System.out.println("Now value is..."+v1);
	  System.out.println("Now Capacity is.."+v1.capacity());
	  v1.add(new Integer(100));
	  v1.add(45.65f);
	  v1.add("Rahul");
	  System.out.println("Now size is..."+v1.size());
	  System.out.println("Now capacity is..."+v1.capacity());
	  System.out.println("Now value is..."+v1);
	  v1.remove(0);
	  System.out.println("Now size is..."+v1.size());
	  System.out.println("Now capacity is..."+v1.capacity());
	  System.out.println("Now value is..."+v1);
	  v1.remove(1);
	  System.out.println("Now value is ..."+v1);
	  v1.remove("Rahul");
	  System.out.println("Now size is ..."+v1.size());
	  System.out.println("Now capacity is..."+v1.capacity());
	  System.out.println("Now value is..."+v1);
	  v1.add(new Integer(200));
	  v1.add(new Integer(300));
	  System.out.println("now size is..."+v1.size());
	  System.out.println("Now capacity is..."+v1.capacity());
	  System.out.println("Now value is ..."+v1);
	  v1.add(new Integer(500));
	  v1.add(new Integer(700));
	  System.out.println("now value is ..."+v1);
	  System.out.println("now");
	  System.out.println("now capacity is ..."+v1.capacity());
	  v1.remove(5);
	  System.out.println("now value is ..."+v1);
	  System.out.println("now capacity is ..."+v1.capacity());
	  v1.remove(2);
	  System.out.println("now value is ..."+v1);
	  System.out.println("now capacity is..."+v1.capacity());
	  v1.add(new Integer(700));
	  System.out.println("now value is..."+v1);
	  System.out.println("now capacity is.."+v1.capacity());
	  
	  
	Iterator i1=v1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	Enumeration e1=v1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
  }
}
