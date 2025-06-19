package com.commen;
class Student
{
	public void show(){}	
}
public class WrapperDemo 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("This is Autoboxing .."+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("This is boxing..."+a);
		
		int c=i2;
		System.out.println("This is unboxing"+c);
		
		String s="200";
		int z=Integer.parseInt(s);
		System.out.println("This is unboxing..."+z);
		
		Object o1= new Object();
		Student s1 = new Student();
		
	
			
	}
}
