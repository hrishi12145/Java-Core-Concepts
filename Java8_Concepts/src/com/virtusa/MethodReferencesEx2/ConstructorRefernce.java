package com.virtusa.MethodReferencesEx2;


public class ConstructorRefernce {

	public ConstructorRefernce() {
		System.out.println("Constructor method Reference");
	}
	public static void main(String[] args) {

        // syntax -  ClassName::new  
		Details details = ConstructorRefernce::new;
		//calling interface method
		details.show();
		
	}

}
