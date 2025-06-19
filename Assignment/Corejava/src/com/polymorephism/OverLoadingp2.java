package com.polymorephism;
class Multiplication
{
	int x,y;
	public void mul()
	{
		x=10;
		y=20;
		System.out.println("First multiplication is..."+(x*y));
	}
	public void mul(int a)
	{
		x=a;
		y=a;
		System.out.println("Second multiplication is..."+(x*y));
	}
	public void mul(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third multiplication is..."+(x*y));
	}
	
	
}
public class OverLoadingp2 
{
	public static void main(String[] args) 
	{
		Multiplication mm = new Multiplication();
		mm.mul();
		mm.mul(2);
		mm.mul(1, 2);
	}
}
