package com.virtusa.publicexp1;

/* public: The public access modifier is specified using the keyword public. 
The public access modifier has the widest scope among all other access modifiers.
Classes, methods, or data members that are declared as public are accessible from 
everywhere in the program. There is no restriction on the scope of public data members.
 */
public class Animal {

	public String animalName;

	public void eat() {
		System.out.println("eat");
	}

	public void sleep() {
		System.out.println("sleep");
	}
	
	public Animal() {
		System.out.println("Constructor is invoked");
	}
}
