package com.code;

// Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class
public class ParentChildClass {
	public static void main(String[] args) {
		ParentClass parentClass = new ParentClass();
		ChildClass childClass = new ChildClass();

		parentClass.printParent();
		childClass.printChild();
		childClass.printParent();
	}
}

class ParentClass {
	public void printParent() {
		System.out.println("This is parent class");
	}
}

class ChildClass extends ParentClass {
	public void printChild() {
		System.out.println("This is child class");
	}
}
