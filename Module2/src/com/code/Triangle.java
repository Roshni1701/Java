package com.code;

// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
public class Triangle {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}

	public double calculateArea() {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public double calculatePerimeter() {
		return side1 + side2 + side3;
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println("Area of triangle: " + triangle.calculateArea());
		System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
	}
}
