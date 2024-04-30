package com.code;

import java.util.Scanner;

// Write a Java program to Take three numbers from the user and print the greatest number
public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter three numbers");
		System.out.print("First number: ");
		int first = scanner.nextInt();

		System.out.print("Second number: ");
		int second = scanner.nextInt();

		System.out.print("Third number: ");
		int third = scanner.nextInt();

		int greatest;
		if (first >= second && first >= third) {
			greatest = first;
		} else if (second >= first && second >= third) {
			greatest = second;
		} else {
			greatest = third;
		}
		System.out.println("The greatest number is: " + greatest);
		scanner.close();
	}
}
