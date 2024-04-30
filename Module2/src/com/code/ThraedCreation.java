package com.code;

// W.A.J. P to create one thread by extending Thread class in another Class.
public class ThraedCreation {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}
}