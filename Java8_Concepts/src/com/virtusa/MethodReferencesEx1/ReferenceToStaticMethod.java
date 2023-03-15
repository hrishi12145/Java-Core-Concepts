package com.virtusa.MethodReferencesEx1;

public class ReferenceToStaticMethod {

	public static void displayMessage() {
		System.out.println(" Static Method Reference...");
	}
	public static void main(String[] args) {

		 // Referring static method 
		Show show = ReferenceToStaticMethod::displayMessage;
		 // Calling interface method 
		show.display();
		
	}

}
