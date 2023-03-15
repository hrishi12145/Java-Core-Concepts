package com.virtusa.core;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("First number is " + Integer.parseInt(args[0]));
		System.out.println("Second number is " + Integer.parseInt(args[1]));
		System.out.println("Product of numbers is : "
				+ new Multiplication().multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
