package com.code;

public class AreaCalculator {
	public void calculateArea(int length, int breadth) {
		int area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public void calculateArea(int side) {
		int area = side * side;
		System.out.println("Area of Square: " + area);
	}

	public static void main(String[] args) {
		AreaCalculator calculator = new AreaCalculator();
		calculator.calculateArea(5, 6);
		calculator.calculateArea(4);
	}
}
