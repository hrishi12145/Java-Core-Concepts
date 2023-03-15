package com.virtusa.core;

import java.util.Scanner;

public class DivisonOfNumbers {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int a = input.nextInt();
			System.out.println("Enter second numbers");
			int b = input.nextInt();

			DivisonOfNumbers object = new DivisonOfNumbers();
			System.out.println("Output :" + object.Divison(a, b));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int Divison(int a, int b) {
		return a / b;
	}
}
