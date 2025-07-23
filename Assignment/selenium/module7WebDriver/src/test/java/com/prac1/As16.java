package com.prac1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class As16 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		System.setProperty("webDriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(2000);
	}
	@Test
	public void test() throws InterruptedException {
	
		driver.findElement(By.name("identifier")).sendKeys("kavitabinwada@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("Passwd")).sendKeys("kavitapatel1506");
		Thread.sleep(3000);
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
		System.out.println("Bye Bye....");
	}
}

	