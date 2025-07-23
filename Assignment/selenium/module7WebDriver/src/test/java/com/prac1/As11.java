package com.prac1;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class As11 
{
	@Test
	public void passTest()
	{
		System.out.println("This is Pass Test...");
	}
	@Test
	public void failTest()
	{
		System.out.println("This is Failed Test...");
		Assert.fail("self");
	}
}

