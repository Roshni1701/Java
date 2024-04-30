package com.code;

// W.A.J. P to create one thread by implementing Runnable interface in Class.
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class ThraedCreation2 {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}