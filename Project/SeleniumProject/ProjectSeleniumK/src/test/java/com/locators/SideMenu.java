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

public class SideMenu 
{
	public void clickSideMenu(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}
	public void clickAllItem(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.id("inventory_sidebar_link")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			Date d1=new Date();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yy HH-mm a");
			System.out.println("Date is.. "+s1.format(d1));
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\kavita selenium\\screenshorts\\allitem-"+s1.format(d1)+".jpg");
			FileUtils.copyFile(src, dest);
		}
	}
	public void clickAbout(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.id("about_sidebar_link")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html") || driver.getCurrentUrl().equals("https://saucelabs.com/"))
		{
			Date d1=new Date();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yy HH-mm a");
			System.out.println("Date is.. "+s1.format(d1));
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\kavita selenium\\screenshorts\\about-"+s1.format(d1)+".jpg");
			FileUtils.copyFile(src, dest);
		}
		driver.navigate().back();
	}
	public void clickResetAppState(WebDriver driver) throws InterruptedException, IOException
	{
		driver.findElement(By.id("reset_sidebar_link")).click();
		Thread.sleep(2000);
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
		{
			Date d1=new Date();
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yy HH-mm a");
			System.out.println("Date is.. "+s1.format(d1));
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\kavita selenium\\screenshorts\\reset-"+s1.format(d1)+".jpg");
			FileUtils.copyFile(src, dest);
		}
	}
}
