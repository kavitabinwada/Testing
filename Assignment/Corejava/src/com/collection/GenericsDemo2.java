package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> aa=new ArrayList<Student>();
		
		Student ss=new Student();
		ss.setSid(1);
		ss.setSname("Kavita");
		ss.setCity("Valsad");
		
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("Rahul");
		s1.setCity("S.Nagar");
		
		aa.add(ss);
		aa.add(s1);
		System.out.println(aa);
		
		Iterator<Student> ii=aa.iterator();
		while(ii.hasNext())
		{
			Student s=ii.next();
			System.out.println("Sid is ..."+s.getSid());
			System.out.println("Sname is..."+s.getSname());
			System.out.println("Scity is..."+s.getCity());
			System.out.println();
		}
	}
}
