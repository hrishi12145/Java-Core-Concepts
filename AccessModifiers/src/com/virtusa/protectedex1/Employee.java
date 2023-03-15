package com.virtusa.protectedex1;

/*
 * protected: The protected access modifier is specified using the keyword protected.
The methods or data members declared as protected are accessible within the same package 
or subclasses in different packages.
 */
public class Employee {

	protected int aadharNo = 123456;

	protected void display() {
		System.out.println("Display the personal Info");
	}

	protected Employee() {
       System.out.println("Constructor is invoked");
	}
}
