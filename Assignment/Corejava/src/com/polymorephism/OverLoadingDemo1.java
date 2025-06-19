package com.polymorephism;
class Addition
{
	int x,y;
	public void sum() 
	{
		x=10;
		y=20;
		System.out.println("First sum is..."+(x+y)); 
	}
	public void sum(int a) 
	{
		x=a;
		y=a;
		System.out.println("Second sum is..."+(x+y));	
	}
	public void sum(float a) 
	{
		x=(int)a;
		y=(int)a;
		System.out.println("float sum is..."+(x+y));	
	}
	public void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is..."+(x+y));
	}
	
}
public class OverLoadingDemo1 
{
	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(45);
		a1.sum(78,98);
		a1.sum(65,65);
	  	
	}
}
