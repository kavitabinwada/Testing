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
import org.testng.annotations.Test;

public class Ass1 
{
	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][]data=null;
		
		String filepath="D:\\kavita selenium\\Ass1AFW.xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		Sheet sheet=workbook.getSheet("AFWAss1"); 
		
		int nrows=sheet.getPhysicalNumberOfRows();
		System.out.println("total number of rows are..."+nrows);
		
		data=new  String[nrows][];  
		for(int i=0;i<nrows;i++)
		{
			Row row=sheet.getRow(i);
			int ncols= row.getPhysicalNumberOfCells();
			System.out.println("total cols are upon row..."+ncols);
			
			data[i]=new String[ncols];
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
	@Test
	public void test() throws InvalidFormatException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\chromedriver-win32\\chromedriver.exe");
		String[][] data=readExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();
			driver.get("https://demo.automationtesting.in/SignIn.html");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahul@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahul");
			Thread.sleep(3000);
			driver.findElement(By.id("enterbtn")).click();
			Thread.sleep(3000);
			System.out.println("See you..");
			driver.close();	
		}
	}
	
}
