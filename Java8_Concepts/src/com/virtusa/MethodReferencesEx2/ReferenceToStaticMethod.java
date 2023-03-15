package com.virtusa.MethodReferencesEx2;

public class ReferenceToStaticMethod {

	public static void displayDetails() {
		System.out.println(" Static Method Reference...");
	}
	public static void main(String[] args) {

		 // Referring static method 
		Details details = ReferenceToStaticMethod::displayDetails;
		 // Calling interface method 
		details.show();
		
	}

}
