package com.virtusa.MethodReferencesEx1;
/*
 * You can refer a constructor by using the new keyword. 
 * Here, we are referring constructor with the help of functional interface.

Syntax
      ClassName::new  
 * 
 */
public class ConstructorReference {

	public ConstructorReference() {
		System.out.println("Constructor method Reference");
	}
	public static void main(String[] args) {

        // syntax -  ClassName::new  
		Show show = ConstructorReference::new;
		//calling interface method
		show.display();
		
	}

}
