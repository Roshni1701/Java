package com.code;

import java.util.Scanner;

// Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a single alphabet character: ");
		String input = scanner.nextLine();

		scanner.close();

		if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
			char ch = Character.toLowerCase(input.charAt(0));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		} else {
			System.out.println("Error: Please enter a single alphabet character.");
		}
	}
}
