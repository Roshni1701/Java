package com.code;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to join two array lists.
public class JoinArrayLists {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();

		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");

		list2.add("Grapes");
		list2.add("Mango");

		List<String> joinedList = new ArrayList<>(list1);
		joinedList.addAll(list2);

		System.out.println("Joined ArrayList:");
		System.out.println(joinedList);
	}
}
