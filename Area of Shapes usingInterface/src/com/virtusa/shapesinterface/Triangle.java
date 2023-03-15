package com.virtusa.shapesinterface;

public class Triangle implements Shapes {
	public void area(int width, int height) {
		System.out.println("Triangle is ½ * base * height ");
		// Area =
		double area = (width * height) / 2;
		System.out.println("Area of Triangle is: " + area);
	}

}