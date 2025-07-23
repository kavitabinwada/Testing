package com;

import org.testng.annotations.Test;

public class As18 
{
	@Test(groups = {"purple"})
	public void purple1()
	{
		System.out.println("This is purple1...");
	}
	@Test(groups = {"purple"})
	public void purple2()
	{
		System.out.println("This is purple2...");
	}
	@Test(groups= {"purple"})
	public void purple3()
	{
		System.out.println("This is purple3...");
	}
	@Test(groups= {"yellow"})
	public void yellow1()
	{
		System.out.println("This is yellow1...");
	}
	@Test(groups= {"yellow"})
	public void yellow2()
	{
		System.out.println("This is yellow2...");
	}
	@Test(groups= {"yellow"})
	public void yellow3()
	{
		System.out.println("This is yellow3...");
	}
	@Test(groups= {"purple","yellow"})
	public void purple_yellow()
	{
		System.out.println("This is purple_yellow...");
	}
	
} 
}
