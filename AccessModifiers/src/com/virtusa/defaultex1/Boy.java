package com.virtusa.defaultex1;

/*
 * When no access modifier is specified for a class, method, or data member – It is said to be having the default access modifier by default. 
The data members, class or methods which are not declared using any access modifiers
 i.e. having default access modifier are accessible only within the same package.
 */
class Boy {

	String Gender;

	void sleep() {
		System.out.println("Sleeping");
	}

	void read() {
		System.out.println("Reading");
	}

}
