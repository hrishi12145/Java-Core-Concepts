package com.virtusa.shapesinterface;

public class Rectangle implements Shapes {
	public void area(int length, int breadth) {
		System.out.println("Rectangle is ½ * base * height ");
		// Area = length*width;
		double area = length * breadth;
		System.out.println("Area of Rectangle is:" + area);
	}
}
