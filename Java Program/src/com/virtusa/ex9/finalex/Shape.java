package com.virtusa.ex9.finalex;

// If you make any method as final, you cannot override it.
public class Shape {

	final void area() {
		
	}
	
	void display() {
		
	}
}

class Square extends Shape {
	void area() {
		System.out.println("This is Area of Sqaure");
	}
	void display() {
		System.out.println("Displyed");
	}
	public static void main(String[] args) {
		Square obj = new Square();
		obj.area();
	}
}
