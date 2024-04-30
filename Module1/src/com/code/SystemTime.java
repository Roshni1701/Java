package com.code;

import java.time.LocalTime;

// Write a Java program to display the system time
public class SystemTime {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current System Time: " + currentTime);
	}
}
