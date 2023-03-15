package com.virtusa.polymorphism;

class Human {
	// Overridden method
	public void speak() {
		System.out.println("Human can speak");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
}

class Boy extends Human {
	// Overriding method
	public void speak() {
		System.out.println("Boy speaks in English");
	}

}

public class MethodOverriding {

	public static void main(String args[]) {
		Boy obj = new Boy();
		// This will call the child class version of eat()
		obj.speak();
		
		//This will call the parent class version of Sleep()
		obj.sleep();
		
	
	}

}
