package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value=\"Male\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value=\"FeMale\"]")).click();
		Thread.sleep(3000);
		
		driver.close();
	}
}
