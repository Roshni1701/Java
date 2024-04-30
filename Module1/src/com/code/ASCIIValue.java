package com.code;

import java.util.Scanner;

// Write a Java program to print the ASCII value of a given character.
public class ASCIIValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		scanner.close();

		int asciiValue = (int) character;
		System.out.println("ASCII value of '" + character + "' is: " + asciiValue);
	}
}
