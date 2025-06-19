package com.pk3;

import com.pk2.Car;

public class PackageDemo 
{
	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setCarData();
		c1.display();
		
	//	com.pk1.Car c2 =new com.pk1.Car(); type name = new type();
	   
		com.pk1.Car c2 =new com.pk1.Car();
		
	
	}

}
