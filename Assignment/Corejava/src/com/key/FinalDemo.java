package com.key;
final class FDemo
{
	final int no=234;
	String name;
	public final void setData()
	{
		//no=132;
		name="Kavi";
		
	}
	public void show() 
	{
		System.out.println("no is.."+no);
		System.out.println("name is.."+name);
		
	}
	
}

class FinalDemo 
{
	public static void main(String[] args) 
	{
		FDemo ff =new FDemo();
		ff.setData();
		ff.show();
		
	}
}
