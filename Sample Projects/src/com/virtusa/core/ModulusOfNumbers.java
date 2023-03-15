package com.virtusa.core;

import java.util.Scanner;

public class ModulusOfNumbers {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int a = input.nextInt();
			System.out.println("Enter second numbers");
			int b = input.nextInt();

			ModulusOfNumbers object = new ModulusOfNumbers();
			System.out.println("Remainder of numbers is : " + object.Modulus(a, b));
			;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int Modulus(int a, int b) {
		return a % b;
	}
}
