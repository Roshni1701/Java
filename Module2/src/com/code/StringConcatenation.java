package com.code;

import java.util.Scanner;

// W.A.J.P to concatenate a given string to the end of another string.
public class StringConcatenation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the original string: ");
		String originalString = scanner.nextLine();

		System.out.print("Enter the string to concatenate: ");
		String stringToConcatenate = scanner.nextLine();

		System.out.println("Concatenated string: " + originalString.concat(stringToConcatenate));
		scanner.close();
	}
}
