package com.prac1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class As10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath("//*[@id=\"table01\"]/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"table01\"]/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"table01\"]/tbody/tr[3]/td[1]/input")).click();
		Thread.sleep(3000);
		
		
//		driver.findElement(By.xpath("//input[@value='Deleted']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='Deleted']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		List<WebElement> head = driver.findElements(By.xpath("//div[@id='cont']/table/thead/tr/th"));
		for(int i=1; i<=head.size();i++) {
			WebElement h= driver.findElement(By.xpath("//div[@id='cont']/table/thead/tr[1]/th["+i+"]"));
			System.out.print(h.getText()+" | ");
		}
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@id='cont']/table/tbody/tr"));
		for(int i=1; i<=row.size(); i++) {
			List<WebElement> col = driver.findElements(By.xpath("//div[@id='cont']/table/tbody/tr["+i+"]/td"));
			
			for(int j=1; j<col.size(); j++) {
				List<WebElement> data = driver.findElements(By.xpath("//div[@id='cont']/table/tbody/tr["+i+"]/td["+j+"]"));
				for(WebElement h: data)
				{
					System.out.print(h.getText());
					
				}
				System.out.println();
			}
			
		}
		
	}
}
