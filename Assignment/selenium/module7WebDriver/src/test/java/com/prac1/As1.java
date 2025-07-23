// W.A.J.Script for Locating links by linkText() and partialLinkText()
package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class As1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
}
