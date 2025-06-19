package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsP2 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> ee=new ArrayList<Employee>();
		
		Employee e1= new Employee();
		e1.setEid(1);
		e1.setName("Kavi");
		e1.setLocation("Valsad");
		

		Employee e2= new Employee();
		e2.setEid(2);
		e2.setName("Ami");
		e2.setLocation("Vapi");
		
		ee.add(e1);
		ee.add(e2);
		
		Iterator<Employee> ii=ee.iterator();
		while(ii.hasNext())
		{
			Employee ee1 =ii.next();
			
			System.out.println("Eid is..."+ee1.getEid());
			System.out.println("Ename is..."+ee1.getName());
			System.out.println("ELoction is..."+ee1.getLocation());
		}
		
		
		
		
		
	}
}

