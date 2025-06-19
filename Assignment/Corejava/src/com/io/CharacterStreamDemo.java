package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fw = new FileWriter("a2.txt");
			String s="This is Tops Technologies...";
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("File Write...");
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		try
		{
			FileReader fr =new FileReader("a2.txt");
			int x;
			while((x=fr.read()) != -1)
			{
				System.out.println((char)x);
			}
			fr.close();	
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	}
}
