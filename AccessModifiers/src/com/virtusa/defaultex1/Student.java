package com.virtusa.defaultex1;
/*
 * The data members, class or methods which are not declared using any access modifiers
 i.e. having default access modifier are accessible only within the same package.
 */
class Student extends Boy {

	int id;
	String name;

	void read() {
		System.out.println("Java programming book");
	}

	Student() {

	}

	Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("id: " + this.id);
		System.out.println("name: " + this.name);
	}


	 void setId(int id) {
		this.id = id;
	}

	 void setName(String name) {
		this.name = name;
	}

}
