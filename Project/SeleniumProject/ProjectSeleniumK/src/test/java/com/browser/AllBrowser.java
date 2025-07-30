package com.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser 
{
	WebDriver driver=null;
	public WebDriver getBrowser(String bname,String url)
	{
		if(bname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
			driver=new ChromeDriver();	
			
		}
		else if(bname.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
			driver=new FirefoxDriver();	
		
		}
		else if(bname.equals("edge"))
		{
		System.setProperty("webdriver.edge.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();	
		
		}
		driver.get(url);
		return driver;
	}
}
