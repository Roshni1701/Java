package com.code;

import java.util.Scanner;

// Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
public class SumNAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int number;

		System.out.println("Please enter 5 numbers:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			number = scanner.nextInt();
			sum += number;
		}

		double average = sum / 5.0;
		System.out.println("Sum of the entered numbers = " + sum);
		System.out.println("Average of the entered numbers = " + average);
		scanner.close();
	}
}
