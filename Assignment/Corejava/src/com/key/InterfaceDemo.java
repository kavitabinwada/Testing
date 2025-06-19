package com.key;
class Staff
{
	String stname,sname;
	public void setStaffData() 
	{
		sname="Kavita";
		stname="Rahul";
		
	}
	
}
class Inter extends Staff implements Student,Result
{
	String admin;
	public void setAdminData() 
	{
		admin="Nirupa";
	}

	@Override
	public void show()
	{
		System.out.println("Your no is..."+no);	
		System.out.println("Student name is..."+sname);
		System.out.println("Staff name is..."+stname);
		System.out.println("Admin name is..."+admin);
		System.out.println("grade is..."+grade);
	}	
}
public class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		Student.display();
		Inter ii= new Inter();
		ii.setStaffData();
		ii.setAdminData();
		ii.show();
	}
}
