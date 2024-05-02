package com.code;

// We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both the students.
abstract class Marks {
	abstract double getPercentage();
}

class StudentA extends Marks {
	private int subject1, subject2, subject3;

	StudentA(int s1, int s2, int s3) {
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
	}

	@Override
	double getPercentage() {
		return (subject1 + subject2 + subject3) / 3;
	}
}

class StudentB extends Marks {
	private int subject1, subject2, subject3, subject4;

	StudentB(int s1, int s2, int s3, int s4) {
		subject1 = s1;
		subject2 = s2;
		subject3 = s3;
		subject4 = s4;
	}

	@Override
	double getPercentage() {
		return (subject1 + subject2 + subject3 + subject4) / 4;
	}
}

public class MarksMain {
	public static void main(String[] args) {
		StudentA studentA = new StudentA(80, 45, 65);
		StudentB studentB = new StudentB(60, 95, 45, 96);

		System.out.println("Percentage of marks for Student A: " + studentA.getPercentage() + "%");
		System.out.println("Percentage of marks for Student B: " + studentB.getPercentage() + "%");
	}
}
