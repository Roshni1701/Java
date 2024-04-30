package com.code;

// W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon () method of Thread class and check whether the thread is set daemon or not by using is Daemon () method.
public class TestDaemonThread extends Thread {

	public void run() {
		if (isDaemon()) {
			System.out.println(getName() + " is daemon thread.");
		} else {
			System.out.println(getName() + " is not a daemon thread.");
		}
	}

	public static void main(String[] args) {
		TestDaemonThread t1 = new TestDaemonThread();
		TestDaemonThread t2 = new TestDaemonThread();

		t1.start();
		t2.start();

		t1.setDaemon(true);

		System.out.println("Is t1 a daemon thread " + t1.isDaemon());
	}
}
