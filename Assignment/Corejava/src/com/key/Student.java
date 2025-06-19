package com.key;
interface Result
{
	String grade="A+";
}
public interface Student extends Result 
{
	int no=100;
	public void show(); 
	public static void display()
	{
		System.out.println("This is the interface Demo...");
	}
	

}
