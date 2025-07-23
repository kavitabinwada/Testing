package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class As19 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforeLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}
	
	@Test
	@Parameters({"un","ps"})
	public void loginTest(String un,String ps) throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys(un);
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(ps);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value=Login']")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("see you next time...");
		driver.close();
	}
		
}
