package com.code;

//Create a class named 'Member' having the following members: Data members Name Age Phone number Address 5 - Salary It also has a method named 'printSalary' which prints the salary of the members. Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and  'Manager' classes have data members 'specialization' and'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}
}

class Employee extends Member {
	String specialization;

	public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.specialization = specialization;
	}

	public void display() {
		System.out.println("Employee details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		System.out.println("Specialization: " + specialization);
		printSalary();
	}
}

class Manager extends Member {
	String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}

	public void display() {
		System.out.println("Employee details: ");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Address: " + address);
		System.out.println("Department: " + department);
		printSalary();
	}
}

public class Organization {
	public static void main(String[] args) {
		Employee employee = new Employee("Roshni Thakar", 31, "987456321", "123 Elm St", 50000, "Software Engineer");
		Manager manager = new Manager("Ankit Thakar", 31, "897456123", "456 Oak St", 75000, "HR");

		employee.display();
		System.out.println();
		manager.display();
	}
}
