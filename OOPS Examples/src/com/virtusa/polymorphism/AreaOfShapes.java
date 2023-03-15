package com.virtusa.polymorphism;

import java.util.Scanner;

class Shapes {
	// Method Overloading
	public void area(int a, int b) {
	}

	public void area(int a) {
	}

}
// Method Overriding
class Square extends Shapes {
	public void area(int a, int b) {
		System.out.println("Square is ½ * base * height ");
		// Area of Square = side*side
		double area = a * b;
		System.out.println("Area of Square is: " + area);
	}

}

class Rectangle extends Shapes {
	public void area(int length, int breadth) {
		System.out.println("Rectangle is ½ * base * height ");
		// Area = length*width;
		double area = length * breadth;
		System.out.println("Area of Rectangle is:" + area);
	}

}

class Triangle extends Shapes {
	public void area(int width, int height) {
		System.out.println("Triangle is ½ * base * height ");
		// Area =
		double area = (width * height) / 2;
		System.out.println("Area of Triangle is: " + area);
	}

}

class Circles extends Shapes {
	public void area(int a) {
		System.out.println("Circle is 3.14 * radius * radius ");

		int radius = a;
		// formula to calculate area of circle
		double area = Math.PI * (radius * radius);
		System.out.printf("Area is: %.2f", area);
	}

}

public class AreaOfShapes {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter side for Square");
			int side=sc.nextInt();
			Square mySquare = new Square(); // Create a Square Object
			mySquare.area(side,side);
			System.out.println();
			
			System.out.println("Enter length for rectangle");
			int len = sc.nextInt();
			System.out.println("Enter breadth for Reactangle ");
			int bre= sc.nextInt();
			Rectangle myRectangle = new Rectangle(); // create a Rectangle Object
			myRectangle.area(len, bre);
			System.out.println();
			
			System.out.println("Enter base for Traingle");
			int base=sc.nextInt();
			System.out.println("Enter height for Triangle");
			int height=sc.nextInt();
			Triangle myTriangle = new Triangle(); // create a Triangle Object
			myTriangle.area(base, height);
			System.out.println();
			
			System.out.println("Enter radius for circle");
			int r =sc.nextInt();
			Circles myCircle = new Circles(); // create a Circle Object
			myCircle.area(r);
		}
	}

}
