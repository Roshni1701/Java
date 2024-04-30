package com.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Write a Java program to convert a hash set to a List/ArrayList.
public class HashSetToList {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		System.out.println(hashSet);

		List<String> arrayList = new ArrayList<>(hashSet);

		System.out.println("ArrayList elements:");
		for (String element : arrayList) {
			System.out.print(element);
		}
	}
}
