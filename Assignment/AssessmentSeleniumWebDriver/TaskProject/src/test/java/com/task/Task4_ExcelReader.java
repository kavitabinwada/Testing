package com.task;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task4_ExcelReader
{
	String filepath;
	String sheetname;
	
	public Task4_ExcelReader(String filepath,String sheetname)
	{
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;	
	}
	public int rowCount()
	{
		int i=0;
		try
		{
			
			XSSFWorkbook  workbook= new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			i = worksheet.getPhysicalNumberOfRows();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	public int colCount()
	{
		int i=0;
		try
		{
			XSSFWorkbook  workbook= new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public String getData(int row,int col)
	{
		String data=null;
		try
		{

			XSSFWorkbook  workbook= new XSSFWorkbook(filepath);
			XSSFSheet worksheet = workbook.getSheet(sheetname);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(data);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
	
	
}
