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
import org.testng.annotations.Test;

public class DataDrivenDemo2
{
	@Test
	public String[][] myExcel() throws InvalidFormatException, IOException
	{
		String[][] data=null;
		String filepath="D:\\kavita selenium\\login.xlsx";
		
		File file=new File(filepath);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);//open excel file
		Sheet sheet=wb.getSheet("Sheet1");// open the particular sheet
		int tNumberOfRows=sheet.getPhysicalNumberOfRows();//total number of physical rows
		System.out.println("Total number of rows are"+tNumberOfRows);//total rows will be printed
		
		data=new String[tNumberOfRows][];//jagged array(assigned row 
		for(int i=0;i<tNumberOfRows;i++)
		{
			Row row=sheet.getRow(i);//to select particular row
			
			int tNOColumns=row.getPhysicalNumberOfCells();//total number of column in the first row
			System.out.println("total cols on particular row ..."+tNOColumns);
			
			data[i]=new String[tNOColumns];
			for(int j=0;j<tNOColumns;j++)
			{ 
				Cell cols=row.getCell(j);// to select particular column
				cols.setCellType(CellType.STRING);// all columns values are in String
				data[i][j]=cols.getStringCellValue();	
			}
		}
		return data;	
	}
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\kavita selenium\\login.xlsx");
		driver=new ChromeDriver();
		String[][] data=myExcel();
		for(int i=0;i<data.length;i++)
		{
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("user-name")).sendKeys(data[i][0]);
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys(data[i][1]);
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			Thread.sleep(3000);
			System.out.println("Bye Bye...");
			driver.close();
		}
	}	
	}

