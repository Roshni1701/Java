package com.code;

import java.util.Scanner;

// Write a program in Java to display the pattern like right angle triangle with a number. 
public class Pattern1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows for the triangle: ");
		int rows = scanner.nextInt();
		scanner.close();

		for (int i = 0; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}
}
