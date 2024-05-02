package com.code;

import java.util.Scanner;

// Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.
class Complex {
	double real;
	double imaginary;

	Complex(double r, double i) {
		real = r;
		imaginary = i;
	}

	Complex add(Complex c) {
		return new Complex(real + c.real, imaginary + c.imaginary);
	}

	Complex sub(Complex c) {
		return new Complex(real - c.real, imaginary - c.imaginary);
	}

	Complex mul(Complex c) {
		double realPart = real * c.real - imaginary * c.imaginary;
		double imagPart = real * c.imaginary + imaginary * c.real;
		return new Complex(realPart, imagPart);
	}
}

public class ComplexMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter real and imaginary part of first complex number: ");
		double real1 = scanner.nextDouble();
		double imag1 = scanner.nextDouble();

		System.out.println("Enter real and imaginary part of second complex number: ");
		double real2 = scanner.nextDouble();
		double imag2 = scanner.nextDouble();

		scanner.close();
		
		System.out.println("First Complex Number: " + real1 + " + " + imag1 + "i");
		System.out.println("Second Complex Number: " + real2 + " + " + imag2 + "i");

		Complex complex1 = new Complex(real1, imag1);
		Complex complex2 = new Complex(real2, imag2);

		Complex sum = complex1.add(complex2);
		Complex difference = complex1.sub(complex2);
		Complex product = complex1.mul(complex2);

		System.out.println("Sum: " + sum.real + " + " + sum.imaginary + "i");
		System.out.println("Difference: " + difference.real + " + " + difference.imaginary + "i");
		System.out.println("Product: " + product.real + " + " + product.imaginary + "i");
	}
}
