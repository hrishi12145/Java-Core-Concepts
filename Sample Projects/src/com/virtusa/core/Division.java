package com.virtusa.core;

public class Division {

	public static void main(String[] args) {
		System.out.println("First number is " + Integer.parseInt(args[0]));
		System.out.println("Second number is " + Integer.parseInt(args[1]));
		System.out.println("Output : " + new Division().division(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}

	public int division(int a, int b) {
		return a / b;
	}

}
