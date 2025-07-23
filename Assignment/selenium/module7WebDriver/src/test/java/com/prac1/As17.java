package com.prac1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	public class As17 
	{
		
		WebDriver driver=null;
		
		@DataProvider(name="kavita")
		public Object[][] ass()
		{
			return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
		}
		
		@Test(dataProvider="kavita")
		public void loginTest(String un,String ps) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.id("user-name")).sendKeys(un);
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys(ps);
			Thread.sleep(3000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
			
			System.out.println("see you soon...");
			driver.close();
		}
		
	}


