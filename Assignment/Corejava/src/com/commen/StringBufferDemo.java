package com.commen;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("This is Tops Technologies...");
		System.out.println("Original String is..."+s1);
		System.out.println("Original Length is..."+s1.length());
		s1.insert(0,"Hello  ");
		System.out.println("the original String is.."+s1);
		System.out.println("the original String is.."+s1.length());
		s1.append("Kavi");
		System.out.println("the original String is.."+s1);
		System.out.println("the original String is.."+s1.length());
		
		s1.delete(0, 4);
		System.out.println("the original String is.."+s1);
		System.out.println("the original String is.."+s1.length());
		
		s1.reverse();
		System.out.println("the original String is.."+s1);
		System.out.println("the original String is.."+s1.length());
		
		s1.reverse();
		System.out.println("the original String is.."+s1);
		System.out.println("the original String is.."+s1.length());
		
		
		
		
		
	}
}
