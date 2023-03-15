package com.virtusa.core;

import java.util.Scanner;

public class SubstractionOfNumbers {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int a = input.nextInt();
			System.out.println("Enter second numbers");
			int b = input.nextInt();

			SubstractionOfNumbers object = new SubstractionOfNumbers();
			System.out.println("The remaining value is " + object.Substraction(a, b));
			;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int Substraction(int a, int b) {
		return a - b;
	}
}