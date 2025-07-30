package com.task;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class LocatorsClass 
{
	WebDriver driver=null;
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Bye Bye...");
		driver.close();
	}
	
}
