package com.key;
abstract class Ademo1
{
	int no;
	String name;
	public abstract void setData(); 
	
	public void show() 
	{
		System.out.println("no is..."+no);
		System.out.println("name is..."+name);
		
	}
	
}
class Demo1 extends Ademo1  {

	@Override
	public void setData() {
		// TODO Auto-generated method stub
		 no=123;
		 name="Kavi";
		
	}
	
}
public class AbstractDemo2 
{
	public static void main(String[] args) 
	{
		Demo1 dd= new Demo1();
		dd.setData();
		dd.show();
	}
}
