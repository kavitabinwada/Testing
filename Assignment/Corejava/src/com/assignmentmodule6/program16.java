//WAP to demonstrate multiple catch blocks
package com.assignmentmodule6;

public class program16
{
	public static void main(String[] args) 
	{
		 try {
			 int result=10/2;
			 System.out.println(result);
			 int[] numbers= {9,8,7};
			 System.out.println(numbers[2]);
			 
			 String s=null;
			 System.out.println(s.length());
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException...."+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArraIndexOutOfBounseException...."+e.getMessage());
		}catch (Exception e) {
			System.out.println("msg");
		}
		 System.out.println("Program is continue after try and catch block");
	}
}
