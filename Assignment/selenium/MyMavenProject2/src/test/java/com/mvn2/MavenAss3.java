package com.mvn2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenAss3 
{
	
	WebDriver driver = null;
	@BeforeClass
	public void test() 
	{

		System.setProperty("webdriver.chrome.driver","/Users/kavitapatel123/Desktop/Kavita Selenium/chromedriver-mac-arm64/chromedriver");
		driver=new ChromeDriver();	
	}
	@Test
	public void MyTest()
	{
		driver.get("https://www.google.com/");
		String T=driver.getTitle();
		System.out.println(T);
	}
	@AfterClass
	public void getClose()
	{
		driver.close();
	}
}
