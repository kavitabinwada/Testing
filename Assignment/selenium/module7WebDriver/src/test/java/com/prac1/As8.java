package com.prac1;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class As8 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdrivr.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		
		WebElement widgets=driver.findElement(By.linkText("Widgets"));
		WebElement interactions=driver.findElement(By.linkText("Interactions"));
	 
		
		Actions actions=new Actions(driver);
		Action aa=actions.moveToElement(widgets)
				.build();
		aa.perform();
		Thread.sleep(3000);
		
		Action aa2=actions.moveToElement(interactions)
				.build();
		aa2.perform();
		Thread.sleep(3000);
		driver.close();
	}
}
