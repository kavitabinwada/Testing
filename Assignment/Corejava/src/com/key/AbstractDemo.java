package com.key;
abstract class Ademo
{
	int no;
	String name;
	public void setData() 
	{
		no=145;
		name="Kavi";	
	}
	public void display() 
	{
		System.out.println("Your no is ..."+no);
		System.out.println("Your name is..."+name);
		
	}		
}
class Demo extends Ademo
{
	
}
public class AbstractDemo 
{
	public static void main(String[] args) 
	{
		Demo ad = new Demo();
		ad.setData();
		ad.display();
	}
}
