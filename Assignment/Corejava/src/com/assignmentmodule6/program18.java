
// WAP to create one thread by extending Thread class in another class
package com.assignmentmodule6;

public class program18 
{
	public static void main(String[] args)
	{
		MyThread t1= new MyThread();
		t1.start();
		
	System.out.println("Main Thread is running...");
	}
}

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Mythread is running...");
		
		for(int i=1;i<5;i++)
		{
			System.out.println("My Thread: "+i);
			try {
				Thread.sleep(2000);
				
			}catch(InterruptedException e)
			{
				System.out.println("Thread interrupted...."+e);
			}
		}
	}
}
