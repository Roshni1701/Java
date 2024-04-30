package com.code;

import java.util.ArrayList;

// Write a Java program to remove the third element from an array list.
public class RemoveThirdElement {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");

		System.out.println("ArrayList before removing the third element: " + arrayList);

		if (arrayList.size() >= 3) {
			arrayList.remove(2);
			System.out.println("Third element removed successfully.");
		} else {
			System.out.println("ArrayList doesn't have a third element to remove.");
		}

		System.out.println("ArrayList after removing the third element: " + arrayList);
	}
}
