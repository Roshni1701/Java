package com.code;

// Create a class named 'PrintNumber' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type
public class PrintNumber {
	public void printn(int number) {
		System.out.println("Integer: " + number);
	}

	public void printn(float number) {
		System.out.println("Float: " + number);
	}

	public void printn(double number) {
		System.out.println("Double: " + number);
	}

	public void printn(long number) {
		System.out.println("Long: " + number);
	}

	public static void main(String[] args) {
		PrintNumber printNumber = new PrintNumber();
		printNumber.printn(444);
		printNumber.printn(456321478L);
		printNumber.printn(123.25f);
		printNumber.printn(68956.23658);
	}
}
