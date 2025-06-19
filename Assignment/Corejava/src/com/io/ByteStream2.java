package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStream2 
{
	public static void main(String[] args) 
	{
		try {
			FileOutputStream fos=new FileOutputStream("a1.txt");
			String s="This the Automation testing";
			byte[]b=s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("This this the file to write");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			try 
			{
				FileInputStream fis =new FileInputStream("a1.txt");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
