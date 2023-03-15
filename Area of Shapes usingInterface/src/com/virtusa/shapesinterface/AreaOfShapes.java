package com.virtusa.shapesinterface;

import java.util.Scanner;

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
			int r1 =sc.nextInt();
			int r2 = r1;
			Circle myCircle = new Circle(); // create a Circle Object
			myCircle.area(r1, r2);
		}
	}

}
