package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String url="https://demoqa.com/webtables";
		
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		
		WebElement edit=driver.findElement(By.id("edit-record-1"));
		edit.click();
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.clear();
		firstname.sendKeys("kavi");
		
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.id("delete-record-1")).click();
	}
}
