package com.virtusa.ex9.finalex;
// Final Variable 
public class Car {

	// declaring and initializing a final variable
	final int speedlimit = 60;

	void controlSpeed() {
		// Trying to change the value of the final variable will give an error
		 speedlimit = 150;
	}

	public static void main(String args[]) {
		Car obj = new Car();
		obj.controlSpeed();
	}

}
