package com.key;
class Staff2
{
	String stname,sname;
	public void setStaffData() 
	{
		stname="Rahul";
		sname="Kavi";
	}
	
}

class Inter1 extends Staff2 implements Student1,Result2
{
	String admin;
	public void setInterData()
	{
		admin="Ashmi";
	}

	@Override
	public void show() {
		//no=1234;
		System.out.println("Your no is ..."+no);
		System.out.println("Student name is..."+sname);
		System.out.println("Staff name is..."+stname);
		System.out.println("Admin name is..."+admin);
		System.out.println("Your grad is..."+grad);
	}
	
}


public class Interfacep1 
{
	public static void main(String[] args) 
	{
		Student1.display();
		Inter1 ii=new Inter1();
		ii.setStaffData();
		ii.setInterData();
		ii.show();
	}
}
