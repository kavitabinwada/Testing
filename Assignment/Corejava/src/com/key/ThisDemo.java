package com.key;
class TDemo
{
	int no;
	String name;
public void setData(int no,String name)
{
	no=no;
	name=name;
	
}
public void show() 
{
	System.out.println("no is...."+no); 
	System.out.println("no is...."+name);
	
}
}
public class ThisDemo 
{
	public static void main(String[] args) 
	{
		TDemo tt=new TDemo();
		tt.setData(4,"Kavi");
		tt.show();
		
	}
}
