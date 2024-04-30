package com.code;

import java.util.Arrays;

// Write a Java program to update specific array element by given element.
public class UpdateArrayElement {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50 };

		System.out.println("Array before updating: " + Arrays.toString(array));

		int indexToUpdate = 2;
		int newValue = 35;

		if (indexToUpdate >= 0 && indexToUpdate < array.length) {
			array[indexToUpdate] = newValue;
			System.out.println("Element at index " + indexToUpdate + " updated to " + newValue);
		} else {
			System.out.println("Index out of bounds. Cannot update element.");
		}

		System.out.println("Array after updating: " + Arrays.toString(array));
	}
}
