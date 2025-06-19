package com.polymorephism;
class Addition1
{
	int x,y;
	public void sum()
	{
		x=20;
		y=30;
		System.out.println("First sum is.."+(x+y));
	}
	public void sum(int a)
	{
		x=a;
		y=a;
		System.out.println("Second sum is.."+(x+y));
	}
	public void sum(float a)
	{
		x=(int)a;
		y=(int)a;
		System.out.println("float sum is.."+(x+y));	
	}
	public void sum(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("Third sum is.."+(x+y));
	}
}
public class OverLoadingp1 
{
	public static void main(String[] args) 
	{
		Addition1 a1=new Addition1();
		a1.sum();
		a1.sum(20);
		a1.sum(10);
		a1.sum(20,20);
		
		
		
		
		
	}
}
