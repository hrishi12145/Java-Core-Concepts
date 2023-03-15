package com.virtusa.MethodReferencesEx1;

public class InstanceMethodReference {

	public void displayMessage() {
		System.out.println(" Instance Method Reference...");
	}
	
	public static void main(String[] args) {

		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		
		 // Referring non-static method using reference 
		Show show = instanceMethodReference::displayMessage;
		// Calling interface method 
		show.display();
	}

}
