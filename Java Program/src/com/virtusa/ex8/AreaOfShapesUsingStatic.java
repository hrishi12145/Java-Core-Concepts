package com.virtusa.ex8;

import java.util.Scanner;

class Shapes {
	// Method Overloading
	public void area(int a, int b) {
	}

	public void area(int a) {
	}

// Method Overriding
	static class Square {
		public void area(int a, int b) {
			System.out.println("Square is ½ * base * height ");
			// Area of Square = side*side
			double area = a * b;
			System.out.println("Area of Square is: " + area);
		}

	}

	static class Rectangle {
		public void area(int length, int breadth) {
			System.out.println("Rectangle is ½ * base * height ");
			// Area = length*width;
			double area = length * breadth;
			System.out.println("Area of Rectangle is:" + area);
		}

	}

	static class Triangle {
		public void area(int width, int height) {
			System.out.println("Triangle is ½ * base * height ");
			// Area =
			double area = (width * height) / 2;
			System.out.println("Area of Triangle is: " + area);
		}

	}

	static class Circles {
		public void area(int a) {
			System.out.println("Circle is 3.14 * radius * radius ");

			int radius = a;
			// formula to calculate area of circle
			double area = Math.PI * (radius * radius);
			System.out.printf("Area is: %.2f", area);
		}

	}

}

public class AreaOfShapesUsingStatic {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter side for Square");
			int side = sc.nextInt();
			Shapes.Square mySquare = new Shapes.Square(); // Create a Square Object
			mySquare.area(side, side);
			System.out.println();

			System.out.println("Enter length for rectangle");
			int len = sc.nextInt();
			System.out.println("Enter breadth for Reactangle ");
			int bre = sc.nextInt();
			Shapes.Rectangle myRectangle = new Shapes.Rectangle(); // create a Rectangle Object
			myRectangle.area(len, bre);
			System.out.println();

			System.out.println("Enter base for Traingle");
			int base = sc.nextInt();
			System.out.println("Enter height for Triangle");
			int height = sc.nextInt();
			Shapes.Triangle myTriangle = new Shapes.Triangle(); // create a Triangle Object
			myTriangle.area(base, height);
			System.out.println();

			System.out.println("Enter radius for circle");
			int r = sc.nextInt();
			Shapes.Circles myCircle = new Shapes.Circles(); // create a Circle Object
			myCircle.area(r);
		}
	}

}
