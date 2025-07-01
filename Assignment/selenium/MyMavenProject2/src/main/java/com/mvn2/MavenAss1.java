package com.mvn2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenAss1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/Users/kavitapatel123/Desktop/Kavita Selenium/chromedriver-mac-arm64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title is..."+driver.getTitle());
	}
}
