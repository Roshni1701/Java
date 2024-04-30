package com.code;

import java.util.HashSet;
import java.util.Set;

// Write a Java program to compare two sets and retain elements which are same on both sets. 
public class CompareSets {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);

		set1.retainAll(set2);
		System.out.println("Common elements: " + set1);
	}
}
