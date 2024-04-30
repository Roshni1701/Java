package com.code;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to shuffle elements in an array list.
public class ShuffleArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Orange");
		arrayList.add("Grapes");
		arrayList.add("Mango");

		System.out.println("ArrayList:");
		System.out.println(arrayList);

		Collections.shuffle(arrayList);

		System.out.println("Shuffled ArrayList:");
		System.out.println(arrayList);
	}
}
