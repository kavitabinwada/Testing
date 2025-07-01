package com.mvn2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class MavenAss2 


{
	WebDriver driver = null;
	@Before
	public void test() 
	{
		System.setProperty("webdriver.chrome.driver","/Users/kavitapatel123/Desktop/Kavita Selenium/chromedriver-mac-arm64/chromedriver");
		driver=new ChromeDriver();
		
	}
	@Test
	public void getMainPage() 
	{
		driver.get("https://www.google.com/");
		String Program=driver.getTitle();
		System.out.println(Program);
	} 
	@After
	public void getClose() 
	{
		driver.quit();
	}
}
