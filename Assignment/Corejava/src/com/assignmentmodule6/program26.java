package com.assignmentmodule6;

import java.util.Scanner;

public class program26 

{
	
	public static void main(String[] args) 
	{

		String marks=obtainGrade();
		System.out.println("Grade is... "+marks);
	}
	public static String obtainGrade(){
		//int marks[],number;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your marks (out of hundred):  ");
		int marks=sc.nextInt();
		
		//displayGrade(marks);
		
	if(marks>=91 && marks<=100){
			return "AA";
	}else if(marks>=81 && marks<=90){
			return "AB";
	}else if(marks>=71 && marks<=80){
		    return "BB";
	}else if(marks>=61 && marks<=70){
		    return "BC";
	}else if(marks>=51 && marks<=60){
		    return "CD";
	}else if(marks>=41 && marks<=50){
		    return "DD";
	}else{
		    return "Fail";
	}
	
	
}
	
}
