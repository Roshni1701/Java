package com.code;

import java.util.Scanner;

// Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5 5 + 55 + 555
public class Compute {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer (n): ");
    int n = scanner.nextInt();
    scanner.close();
    
    int nn = n * 10 + n; 
    int nnn = nn * 10 + n;
    int result = n + nn + nnn;

    System.out.println("Result: " + result);
}
}
