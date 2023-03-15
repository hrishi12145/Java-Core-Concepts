package com.virtusa.core;

import java.util.Scanner;

class Sum {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int first = input.nextInt();
			System.out.println("Enter second numbers");
			int second = input.nextInt();

			System.out.println(first + " " + second);

			// add two numbers
			int sum = first + second;
			System.out.println("The sum is: " + sum);
		}
	}
}