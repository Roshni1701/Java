package com.code;

// Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.
public class AreaSquareRectangle {
	public void area(float l, float b) {
		System.out.println("The area of rectangle is: " + (l * b));
	}

	public void area(float l) {
		System.out.println("The area of square is: " + (l * l));
	}

	public static void main(String[] args) {
		AreaSquareRectangle areaSquareRectangle = new AreaSquareRectangle();
		areaSquareRectangle.area(4);
		areaSquareRectangle.area(4.5f, 5.6f);
	}
}
