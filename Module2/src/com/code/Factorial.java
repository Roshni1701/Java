package com.code;

import java.util.Scanner;

// Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n!
public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial: ");
		int number = scanner.nextInt();

		long factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is: " + factorial);
		scanner.close();
	}

	public static long calculateFactorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}

		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
