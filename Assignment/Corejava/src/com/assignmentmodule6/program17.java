//WAP to create one thread by implementing Runnable interface in
package com.assignmentmodule6;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Running thread is..." + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread inter..." + e.getMessage());
			}
		}
	}
}

public class program17 {
	

	public static void main(String[] args) {
		MyRunnable myTask = new MyRunnable();

		Thread myThread = new Thread(myTask);

		myThread.start();

		System.out.println("My thread is running....");
	}

}
