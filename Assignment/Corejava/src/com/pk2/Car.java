package com.pk2;

public class Car 
{
	int price;
	String modelname,modelno;
	
	public void setCarData() 
	{
		modelname="Nexon";
		modelno="Sports700";
		price=1000000;	
	}
	public void display()
	{
		System.out.println("model name is..."+modelname);
		System.out.println("modelno is... "+modelno);
		System.out.println("caar's price is..."+price);
		
	}
	
}
