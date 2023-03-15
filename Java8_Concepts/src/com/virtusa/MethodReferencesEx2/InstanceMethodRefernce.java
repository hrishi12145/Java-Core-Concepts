package com.virtusa.MethodReferencesEx2;

public class InstanceMethodRefernce {
	public void displayDetails() {
		System.out.println(" Instance Method Reference...");
	}
	
	public static void main(String[] args) {

		InstanceMethodRefernce instanceMethodReference = new InstanceMethodRefernce();
		
		 // Referring non-static method using reference 
		Details details = instanceMethodReference::displayDetails;
		// Calling interface method 
		details.show();
	}
}
