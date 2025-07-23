//W.A.J.Script for Selecting multiple items in a  drop down
package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class As2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrivr.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(3000);
		
		
		Select ss=new Select(driver.findElement(By.name("country")));
		Thread.sleep(3000);
		ss.selectByValue("UNITED STATES");
		Thread.sleep(3000);
		driver.close();
	}
}
