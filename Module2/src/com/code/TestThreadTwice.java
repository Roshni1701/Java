package com.code;

// W.A.J.P to start the same Thread twice by calling start () method twice.
public class TestThreadTwice extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		TestThreadTwice t1 = new TestThreadTwice();

		t1.start();
		t1.start(); // This line will throw IllegalThreadStateException
	}
}