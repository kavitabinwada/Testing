package com.task;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class Task1 
{
WebDriver driver=null;
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\kavita selenium\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	@Test(priority = 0)
	public void firstname() throws InterruptedException
	{
		driver.findElement(By.id("firstName")).sendKeys("Kavita");
		Thread.sleep(2000);
	}
	@Test(priority = 1)
	public void lastname() throws InterruptedException
	{
		driver.findElement(By.id("lastName")).sendKeys("Patel");
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void email() throws InterruptedException
	{
		driver.findElement(By.id("userEmail")).sendKeys("kavita@gmail.com");
		Thread.sleep(2000);
		
	}
	@Test(priority = 3)
	public void gender() throws InterruptedException
	{
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-3']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 4)
	public void mobile() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9016545414");
		Thread.sleep(2000);
	}
	@Test(priority = 5)
	public void dob() throws InterruptedException
	{
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		Select s1=new Select(driver.findElement(By.className("react-datepicker__month-select")));
		s1.selectByVisibleText("March");
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.className("react-datepicker__year-select")));
		s2.selectByVisibleText("1988");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("div.react-datepicker__day.react-datepicker__day--009")).click();
		driver.findElement(By.xpath("//div[text()='9']")).click();
		Thread.sleep(2000);
	}
	@Test(priority = 6)
	public void subject() throws InterruptedException
	{
		driver.findElement(By.id("subjectsInput")).sendKeys("java");
		Thread.sleep(4000);

		}
	@Test(priority = 7)
	public void hobbies() throws InterruptedException
	{
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void picture() throws InterruptedException
	{
	
		driver.findElement(By.id("uploadPicture")).sendKeys("D:\\K_Image");
		Thread.sleep(3000);
		
	}
	@Test(priority = 9)
	public void address() throws InterruptedException
	{
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Ahmedabad");
		Thread.sleep(3000);
	}
	
	@Test(priority = 10)
	public void state() throws InterruptedException
	{
		WebElement st=driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
		st.click();
		Thread.sleep(3000);
		
		Actions actions=new Actions(driver);
		
		org.openqa.selenium.interactions.Action aa=actions.moveToElement(st)
				.keyDown(st,Keys.SHIFT)
				.sendKeys("Rajasthan")
			    .keyUp(st,Keys.SHIFT)
			    .build();
		aa.perform();
	}
	@Ignore
	@Test(priority = 11)
	public void city() throws InterruptedException
	{
		WebElement city= driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.click();
		
		Actions actions=new Actions(driver);
		org.openqa.selenium.interactions.Action a2=actions.moveToElement(city)
				.keyDown(city, Keys.SHIFT)
				.keyUp(city, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		a2.perform();
	}
	@Test(priority = 12)
	public void submit() throws InterruptedException, IOException
	{
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	    File dest=new File("D:\\success.jpg");
		
//		FileUtils.copyFile(src,dest);		
//		Thread.sleep(1000);
	
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("Bye Bye...");
		driver.close();
	}
}


