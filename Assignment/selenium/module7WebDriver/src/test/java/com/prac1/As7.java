package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrivr.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		Select ss=new Select(driver.findElement(By.id("Skills")));
		Thread.sleep(3000);
		ss.selectByIndex(10);
		Thread.sleep(3000);
		driver.close();
		
	}
}
