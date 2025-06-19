package com.key;
class AconPharma{
	String mediName,catagory;
	public void setAconPharmaData()
	{
		mediName="FML";
		catagory="basic";
	}	
	public void display() 
	{
		System.out.println("medicine name is...."+mediName);
		System.out.println("catagory name is..."+catagory);
		
	}
}
class Acon extends AconPharma implements Medicine1,FMCGProduct
{
	String distributorName;
	public void setDistributorName() 
	{
		distributorName="Rapid";
		
	}

	@Override
	public void show() {
		
		System.out.println("This medicine batch number is..."+batchNo);
		System.out.println("it's distributoer name is..."+distributorName);
		
	}	
}
public class Interfacep2
{
	public static void main(String[] args) 
	{
		Acon ii=new Acon();
		ii.setAconPharmaData();
		ii.show();
		ii.display();
		
	}
}
