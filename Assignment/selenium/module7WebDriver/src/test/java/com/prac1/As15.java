package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As15 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webDriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("kavitabinwada@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("kavita1506");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
