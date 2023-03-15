package com.virtusa.MethodReferencesEx2;

//Reference to a Static Method
//syntax - ContainingClass::staticMethodName 
public interface Details {
	void show();

	// main method can works in functional interface
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
