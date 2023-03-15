package com.virtusa.shapesinterface;

public class Circle  implements Shapes {
	@Override
	public void area(int a, int b) {
		System.out.println("Circle is 3.14 * radius * radius ");

		double radius1 = a;
		double radius2 = b;
		// formula to calculate area of circle
		double area = Math.PI * (radius1 * radius2);
		System.out.printf("Area is: %.2f", area);
		
	}

}