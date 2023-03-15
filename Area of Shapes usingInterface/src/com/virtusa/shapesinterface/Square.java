package com.virtusa.shapesinterface;

//Method Overriding
class Square implements Shapes {
	public void area(int a, int b) {
		System.out.println("Square is ½ * base * height ");
		// Area of Square = side*side
		double area = a * b;
		System.out.println("Area of Square is: " + area);
	}

}
