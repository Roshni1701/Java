package com.code;

import java.util.Scanner;

// W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
public class StringEndsWith {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the main string: ");
		String mainString = scanner.nextLine();

		System.out.print("Enter the ending string: ");
		String endingString = scanner.nextLine();

		boolean endsWith = mainString.endsWith(endingString);
		System.out.println("\"" + mainString + "\" ends with \"" + endingString + "\" : " + endsWith);
		scanner.close();
	}
}
