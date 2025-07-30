package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:\\kavita\\automation\\TaskProject\\src\\test\\java\\com\\html\\Asstask2.html");
		Thread.sleep(3000);
		
//		String tallestStructure=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText();
//		System.out.println("The tallest structure in the table is :"+tallestStructure);	
		
		for(int i=2;i<=5;i++)
	{
//			for(int j=1;j<=6;j++)
//			{
//				String val=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.print("  "+val);
//			}
//			System.out.println();
//		}
//	
//	}
	 String LastRow=driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]")).getText();
	 System.out.println("The last row has only two coloums:"+LastRow);
	}
	}
}
	

