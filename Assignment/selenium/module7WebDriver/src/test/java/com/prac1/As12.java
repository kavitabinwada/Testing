package com.prac1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class As12 
{
	
		@BeforeTest
		public  static void before()
		{
			System.out.println("Before test...");
		}
		@AfterTest
		public static void after()
		{
			System.out.println("After test...");
		}
		@Test
		public static void test()
		{
			System.out.println("This is my test...");
		}
	
}
