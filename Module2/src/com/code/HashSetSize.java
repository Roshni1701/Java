package com.code;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Write a Java program to get the number of elements in a hash set.
public class HashSetSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> hashSet = new HashSet<String>();
		System.out.println("Enter No. of values to be added: ");
		int n = scanner.nextInt();
		System.out.println("Enter Values");
		for (int i = 0; i < n; i++) {
			hashSet.add(scanner.next());
		}
		System.out.println(hashSet);
		scanner.close();

		int size = hashSet.size();
		System.out.println("Number of elements in the HashSet: " + size);
	}
}
