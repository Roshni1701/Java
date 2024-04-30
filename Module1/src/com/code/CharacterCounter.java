package com.code;

import java.util.Scanner;

// Write a Java program to count the letters, spaces, numbers and other characters of an input string.
public class CharacterCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		int letterCount = 0;
		int spaceCount = 0;
		int numberCount = 0;
		int otherCount = 0;

		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				letterCount++;
			} else if (Character.isDigit(ch)) {
				numberCount++;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else {
				otherCount++;
			}
		}
		System.out.println("Letters: " + letterCount);
		System.out.println("Spaces: " + spaceCount);
		System.out.println("Numbers: " + numberCount);
		System.out.println("Other Characters: " + otherCount);
	}
}
