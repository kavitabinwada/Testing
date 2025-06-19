package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class ByteStream1 
{
	public static void main(String[] args) 
	{
		try
		{ 
			FileWriter fw=new FileWriter("a2.txt");
			String s="This is Tops Technologes...";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("I am writting my file...");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		try
		{
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
