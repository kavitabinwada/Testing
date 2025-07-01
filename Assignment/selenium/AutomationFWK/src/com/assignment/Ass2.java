package com.assignment;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ass2 
{
	@DataProvider(name="kavi")
	public Object[][] readExcel() throws InvalidFormatException, IOException
	{
		Object[][]data=null;
		
		String filepath="D:\\kavita selenium\\Ass1AFW.xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("AFWAss2"); 
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("total number of rows are..."+nrows);
		
		data=new  Object[nrows][];  
		for(int i=0;i<nrows;i++)
		{
			Row row=sheet.getRow(i);
			int ncols= row.getPhysicalNumberOfCells();
			System.out.println("total cols are upon row..."+ncols);
			
			data[i]=new Object[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cols=row.getCell(j);
				cols.setCellType(CellType.STRING);
				data[i][j]=cols.getStringCellValue();	
			}
		}
		return data;		
	}
	WebDriver driver=null;
	@Test(dataProvider="kavi")
	public void test(String keyword) throws InvalidFormatException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		if(keyword.equals("open browser"))
		{
			driver=new ChromeDriver();
		}
		else if(keyword.equals("enter url"))
		{
			driver.get("https://demo.automationtesting.in/SignIn.html");
			Thread.sleep(3000);
		}
	
		else if(keyword.equals("enter email"))
		{
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahul@gmail.com");
			Thread.sleep(3000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahul");
			Thread.sleep(3000);
		}
		else if(keyword.equals("click login"))
		{
			driver.findElement(By.id("enterbtn")).click();
			Thread.sleep(3000);
		}
		else if(keyword.equals("close browser"))
		{
			System.out.println("See you soon");
			driver.close();
		}		
}	
}
