package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class As8_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrivr.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		
		Actions actions=new Actions(driver);
		Action aa=actions.moveToElement(email)
				.keyDown(email, Keys.SHIFT)
				.sendKeys("Hello")
				.keyUp(email, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		aa.perform();
		Thread.sleep(3000);
		driver.close();
	}
}
