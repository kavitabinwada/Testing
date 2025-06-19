package com.commen;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1=new String("This is Tops Technologies...");
		System.out.println("Original String is..."+s1);
		System.out.println("Original Length is..."+s1.length());
		System.out.println("Uppercase is..."+s1.toUpperCase());
		System.out.println("Lowercase is..."+s1.toLowerCase());
		System.out.println("Substring is..."+s1.substring(2));
		System.out.println("Substring is..."+s1.substring(2, 4));
		System.out.println("Charat is..."+s1.charAt(2));
		System.out.println("Compare is..."+s1.compareTo("This is Tops Technologies"));
		System.out.println("Original String is..."+s1);
		System.out.println("Original length is..."+s1.length());
	}
}
 