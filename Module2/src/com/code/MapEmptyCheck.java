package com.code;

import java.util.HashMap;
import java.util.Map;

// Write a Java program to check whether a map contains key-value mappings (empty) or not
public class MapEmptyCheck {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		if (map.isEmpty()) {
			System.out.println("Map is empty.");
		} else {
			System.out.println("Map is not empty.");
		}

		map.put("A", 1);
		map.put("B", 2);

		if (map.isEmpty()) {
			System.out.println("Map is empty.");
		} else {
			System.out.println("Map is not empty.");
		}
	}
}
