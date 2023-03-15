package com.virtusa.core;

import java.util.Scanner;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int a = input.nextInt();
			System.out.println("Enter second numbers");
			int b = input.nextInt();

			MultiplicationOfNumbers object = new MultiplicationOfNumbers();
			System.out.println("Product of numbers is :" + object.Multiplication(a, b));
			;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int Multiplication(int a, int b) {
		return a * b;
	}

}
