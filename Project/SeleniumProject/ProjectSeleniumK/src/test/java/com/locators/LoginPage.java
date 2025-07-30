package com.locators;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	public void setUserName(WebDriver driver,String username) throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(3000);
	}
	public void setPassword(WebDriver driver,String password) throws InterruptedException
	{
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(3000);
	}
	public void clickLogin(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			System.out.println("Login Test Case is PAssed...");
		}
		else
		{
			Date d1=new Date();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yy HH-mm a");
			System.out.println("Date is.. "+s1.format(d1));
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\kavita selenium\\screenshorts\\login-"+s1.format(d1)+".jpg");
			FileUtils.copyFile(src, dest);
		}
	}
	
}
