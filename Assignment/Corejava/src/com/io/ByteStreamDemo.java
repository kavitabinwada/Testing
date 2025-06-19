package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("a1.txt");
			String s="This is Tops Technologies...";
			byte[]b=s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
			System.out.println("File Write..");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		try
		{
			FileInputStream fis= new FileInputStream("a1.txt");
			int x;
			while((x=fis.read()) != -1)
			{
				System.out.println((char)x);
			}
			fis.close();	
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
}
