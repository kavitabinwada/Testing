package com.task;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task4 
{
	WebDriver driver = null;
	String url = "https://www.demo.guru99.com/V4/";
	
	@BeforeTest
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
	}
	
	@Test(dataProvider = "dp")
	public void login(String username,String password)
	{
		WebElement user = driver.findElement(By.name("uid"));
		user.sendKeys(username);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@DataProvider(name = "dp")
	public static Object[][] data()
	{
		Task4_ExcelReader read= new Task4_ExcelReader("D:\\kavita selenium\\RAs.xlsx", "login");
		int row = read.rowCount();
		int col = read.colCount();
		System.out.println(row + "and"+col);
		Object obj[][] = new Object[row -1][col];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				String data = read.getData(i,j);
				System.out.println(data);
				obj[i -1][j] = data;	
			}
		}
		return obj;	
	}
}
