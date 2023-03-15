package com.virtusa.privateex1;

//Java program to illustrate error while
//using class from different package with
//private modifier
public class Friend extends Employee {

	public static void main(String[] args) {

		Employee employee = new Employee();
		// Trying to access private method
		// of another class
		employee.withdraw();

	}

}
