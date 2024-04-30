package com.code;

import java.util.Scanner;

// Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern like:
public class Pattern2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the triangle: ");
		int rows = scanner.nextInt();
		scanner.close();

		int number = 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}
