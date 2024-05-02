package com.code;

//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.
abstract class Bank {
	abstract int getBalance();
}

class BankA extends Bank {
	@Override
	int getBalance() {
		return 100;
	}
}

class BankB extends Bank {
	@Override
	int getBalance() {
		return 150;
	}
}

class BankC extends Bank {
	@Override
	int getBalance() {
		return 200;
	}
}

public class BankMain {
	public static void main(String[] args) {
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();

		System.out.println("Bank A balance: $" + bankA.getBalance());
		System.out.println("Bank B balance: $" + bankB.getBalance());
		System.out.println("Bank C balance: $" + bankC.getBalance());

	}
}
