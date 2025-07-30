package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.browser.AllBrowser;
import com.locators.AddtoCart;
import com.locators.LoginPage;
import com.locators.SideMenu;

public class AllTest 
{
	LoginPage lp=null;
	AllBrowser ab=null;
	SideMenu sm=null;
	AddtoCart ac=null;
	WebDriver driver=null;
	@BeforeClass
	public void beforeclass() throws InterruptedException 
	{
		driver=ab.getBrowser("chrome","https://www.saucedemo.com/");
		Thread.sleep(3000);
	}	
		
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		ab=new AllBrowser();
		lp=new LoginPage();	
		sm=new SideMenu();
		ac=new AddtoCart();
	}
		
	@Test(priority = 0)
	public void myLoginPage() throws InterruptedException, IOException
	{
		lp.setUserName(driver,"standard_user");
		lp.setPassword(driver,"secret_sauce");
		lp.clickLogin(driver);
	}
	@Test(priority = 1)
	public void mySideMenu() throws InterruptedException, IOException
	{
		sm.clickSideMenu(driver);
		sm.clickAllItem(driver);
		sm.clickResetAppState(driver);
		sm.clickAbout(driver);
	
	}
	@Test(priority = 2)
	public void myAddToCart() throws InterruptedException, IOException 
	{
		ac.addProduct(driver);
		ac.setAddtoCart(driver);
		ac.cShopping(driver);
		ac.selectFDropDown(driver);
    	ac.shoppingCart(driver);
        ac.numAddCart(driver);
        ac.checkOut(driver);
        ac.checkOutFiels(driver);
        ac.checkOutFiels2(driver);
        ac.checkOutFiels3(driver);
        ac.continueFurther(driver);
        ac.finish(driver);
        ac.backToProduct(driver);
        ac.menu(driver);
        ac.logOut(driver);
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Bye Bye....");
		driver.quit();
	}
}
