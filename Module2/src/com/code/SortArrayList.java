package com.code;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program to sort a given array list.
public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(8);
		arrayList.add(1);
		arrayList.add(9);

		System.out.println("ArrayList:");
		System.out.println(arrayList);

		Collections.sort(arrayList);

		System.out.println("Sorted ArrayList:");
		System.out.println(arrayList);
	}
}
