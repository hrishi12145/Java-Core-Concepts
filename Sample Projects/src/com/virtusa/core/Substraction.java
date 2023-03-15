package com.virtusa.core;

public class Substraction {

	public static void main(String[] args) {
		System.out.println("First number is " + Integer.parseInt(args[0]));
		System.out.println("Second number is " + Integer.parseInt(args[1]));
		System.out.println("Remaing value is : "
				+ new Substraction().substraction(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}

	public int substraction(int a, int b) {
		return a - b;
	}

}
