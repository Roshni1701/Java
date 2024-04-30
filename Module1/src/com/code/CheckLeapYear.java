package com.code;

import java.util.Scanner;

// Write a Java program that takes a year from user and print whether that year is a leap year or not.
public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		scanner.close();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
