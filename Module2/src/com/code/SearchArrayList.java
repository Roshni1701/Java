package com.code;

import java.util.ArrayList;
import java.util.Scanner;

// Write a Java program to search an element in an array list. 
public class SearchArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);

		System.out.println("ArrayList:");
		System.out.println(arrayList);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the element to search: ");
		int searchElement = scanner.nextInt();
		scanner.close();

		boolean found = false;
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i) == searchElement) {
				found = true;
				System.out.println("Element found at index " + i);
				break;
			}
		}
		if (!found) {
			System.out.println("Element not found in the ArrayList.");
		}
	}
}
