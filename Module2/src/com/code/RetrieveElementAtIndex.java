package com.code;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to retrieve an element (at a specified index) from a given array list
public class RetrieveElementAtIndex {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");

		System.out.println("ArrayList:");
		System.out.println(arrayList);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the index to retrieve the element: ");
		int index = scanner.nextInt();
		scanner.close();

		if (index >= 0 && index < arrayList.size()) {
			String element = arrayList.get(index);
			System.out.println("Element at index " + index + ": " + element);
		} else {
			System.out.println("Index is out of bounds. Element cannot be retrieved.");
		}
	}
}
