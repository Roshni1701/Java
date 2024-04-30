package com.code;

import java.util.ArrayList;

// Write a Java program to print all the elements of an ArrayList using the position of the elements
public class ArrayListPrint {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Nokia");
		arrayList.add("Oppo");
		arrayList.add("Vivo");
		arrayList.add("MI");

		System.out.println("Elements of the ArrayList:");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Position " + i + ": " + arrayList.get(i));
		}
	}
}
