package com.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

// W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c
public class FrequentCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter String Value:");
		String value = scanner.next();

		char result = findSecondMostFrequentChar(value);
		if (result != '\0') {
			System.out.println("The Second Most Frequent Character is: " + result);
		} else {
			System.out.println("No  Second Most Frequent Character found");
		}
		scanner.close();
	}

	private static char findSecondMostFrequentChar(String value) {
		if (value == null || value.isEmpty()) {
			return '\0';
		}
		Map<Character, Integer> frequencyMap = new HashMap<>();

		for (char ch : value.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		char mostFrequent = '\0', secondMostFrequent = '\0';
		int maxFrequency = 0, secondMaxFrequency = 0;

		for (Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			int freq = entry.getValue();
			if (freq > maxFrequency) {
				secondMaxFrequency = maxFrequency;
				secondMostFrequent = mostFrequent;
				maxFrequency = freq;
				mostFrequent = entry.getKey();
			} else if (freq > secondMaxFrequency && freq != maxFrequency) {
				secondMaxFrequency = freq;
				secondMostFrequent = entry.getKey();
			}
		}

		return secondMostFrequent;
	}
}
