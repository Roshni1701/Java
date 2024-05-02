package com.code;

// Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.
class Rectangle {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		return length * breadth;
	}

	public double getPerimeter() {
		return 2 * (length * breadth);
	}
}

class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
}

public class ParentChildRectangleSquare {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 4);
		System.out.println("Rectangle area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

		Square square = new Square(5);
		System.out.println("Square Area: " + square.getArea());
	}
}
