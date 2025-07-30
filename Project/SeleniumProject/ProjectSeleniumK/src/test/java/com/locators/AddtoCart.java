package com.locators;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;

public class AddtoCart 
{
	public void addProduct(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
	}
	public void setAddtoCart(WebDriver  driver) throws InterruptedException, IOException 
	{
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);
	
	}
	
	public void cShopping(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(3000);
	}
	public void selectFDropDown(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		Thread.sleep(3000);

		Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));
		s1.selectByIndex(1);
		Thread.sleep(3000);
	}
	
	public void shoppingCart(WebDriver driver) throws InterruptedException 
	{
		
		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(3000);
		
	}
	public void numAddCart(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(3000);
		
	}
	public void checkOut(WebDriver driver) throws InterruptedException
	{
		WebElement confirmcart=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
		System.out.println(confirmcart.getText());
		if(Integer.parseInt(confirmcart.getText())>=1)
		{
			driver.findElement(By.id("checkout")).click();
			Thread.sleep(1000);
		}
		else
		{
			fail("No Any PRoduct added into cart");
		}
	}
	public void checkOutFiels(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("first-name")).sendKeys("Kavita");
		Thread.sleep(3000);
	}
	public void checkOutFiels2(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("last-name")).sendKeys("Patel");
		Thread.sleep(3000);
	}
	public void checkOutFiels3(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("postal-code")).sendKeys("396020");
		Thread.sleep(3000);
	}
	public void continueFurther(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
	}
	public void finish(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("finish")).click();
		Thread.sleep(3000);
	}
	public void backToProduct(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		Thread.sleep(3000);
	}
	public void menu(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
	}
	public void logOut(WebDriver driver) throws InterruptedException	
	{
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(3000);
	}
	
}
	
	

