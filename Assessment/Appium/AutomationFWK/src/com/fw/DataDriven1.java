package com.fw;

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
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

public class DataDriven1
{
	@Test
	public String[][] readExcel() throws InvalidFormatException, IOException
	{
		String[][]data=null;
		
		String filepath="D:\\kavita selenium\\test2.xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);// to open the excel file
		
		Sheet sheet=workbook.getSheet("Sheet2"); //to   open the particular sheet
		
		int nrows=sheet.getPhysicalNumberOfRows();// total number of physical rows
		System.out.println("total number of rows are..."+nrows);
		
		data=new  String[nrows][];  // jgg array (to assigned rows)
		for(int i=0;i<nrows;i++)
		{
			Row row=sheet.getRow(i);// select particular row
			int ncols= row.getPhysicalNumberOfCells();
			System.out.println("total cols are upon row..."+ncols);
			
			data[i]=new String[ncols];
			for(int j=0;j<ncols;j++)
			{
				Cell cols=row.getCell(j);
				cols.setCellType(CellType.STRING);//to all column values are String
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
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("user-name")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
			System.out.println("See you nexttime..");
			driver.close();	
		}
	}
	
}
