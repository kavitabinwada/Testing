package com.assignmentmodule6;

public class program25 
{
	public static void main(String[] args) 
	{
		abstract class Parent
		{
			public void message() 
			{
				
			}
		}
		class FirstSubClass
		{
			public void message()
			{
				System.out.println("This is my firstsubclass...");
			}
		}
		class SecondSubClass
		{
			public void message()
			{
				System.out.println("This is my secondsubclass...");
			}
		}
		
		  SecondSubClass ssc=new SecondSubClass();
		  ssc.message();
		  
		  
		  FirstSubClass fsc=new FirstSubClass();
		  fsc.message();
	}
}
