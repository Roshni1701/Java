package com.code;

import java.util.Scanner;

// W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
public class Compare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();
		
		System.out.print("Enter a another string: ");
		String compStr = scanner.nextLine();

		boolean result = str.equals(compStr);
		System.out.println("Comparing " + str + " and " + compStr + ": " + result);
		scanner.close();
	}
}
