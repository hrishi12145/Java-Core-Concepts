package com.virtusa.MethodReferencesEx1;

//Reference to a Static Method
// syntax - ContainingClass::staticMethodName 

@FunctionalInterface
public interface Show {
	void display();
	
	// main method can works in functional interface
    public static void main(String[] args) {
		System.out.println("Hello");
	}
}
