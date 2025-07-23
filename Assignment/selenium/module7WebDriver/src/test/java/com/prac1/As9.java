package com.prac1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As9 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdrivr.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(3000);
		
		Alert aa=driver.switchTo().alert();
		System.out.println("Alert first msg is...."+aa.getText());
		aa.accept();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
}
