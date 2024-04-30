package com.code;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to replace the second element of an ArrayList with the specified element
public class ReplaceSecondElement {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Grapes");
		arrayList.add("Mango");

		System.out.println(arrayList);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value to replace: ");
		String specifiedElement = scanner.next();
		scanner.close();

		if (arrayList.size() >= 2) {
			arrayList.set(1, specifiedElement);
			System.out.println("ArrayList after replacing the second element:");
			System.out.println(arrayList);
		} else {
			System.out.println("ArrayList doesn't have a second element to replace.");
		}
	}
}
