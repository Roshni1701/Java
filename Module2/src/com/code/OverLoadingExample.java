package com.code;

// Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
public class OverLoadingExample {
	public void print(int n, char ch) {
		System.out.println("Integer: " + n + "; Charcter: " + ch);
	}

	public void print(char ch, int n) {
		System.out.println("Charcter: " + ch + "; Integer: " + n);
	}

	public static void main(String[] args) {
		OverLoadingExample example = new OverLoadingExample();
		example.print(1, 'A');
		example.print('B', 2);
	}
}
