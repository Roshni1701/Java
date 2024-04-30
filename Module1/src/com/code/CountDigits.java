package com.code;

import java.util.Scanner;

// Write a Java program that reads a positive integer and count the number of digits the number. Input an integer number less than ten billion: 125463 Number of digits in the number: 6

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer : ");
		long number = scanner.nextLong();

		int numberOfDigits = Long.toString(Math.abs(number)).length();
		scanner.close();
		System.out.println("Number of digits in the number: " + numberOfDigits);
	}
}
