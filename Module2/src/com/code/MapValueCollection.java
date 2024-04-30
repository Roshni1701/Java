package com.code;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Write a Java program to get a collection view of the values contained in this map.
public class MapValueCollection {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);

		Collection<Integer> values = map.values();

		System.out.println("Collection view of values: " + values);
	}
}
