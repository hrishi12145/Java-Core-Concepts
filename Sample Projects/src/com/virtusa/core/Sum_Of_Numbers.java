package com.virtusa.core;

import java.util.Scanner;

public class Sum_Of_Numbers {

	public static void main(String args[]) {

		// line 9 is for taking input from CMD line
		// System.out.println(new
		// Sum_Of_Numbers().SumOfNumbers(Integer.parseInt(args[0]),
		// Integer.parseInt(args[1])));

		// Addition of 2 Numbers

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter first numbers");
			int a = input.nextInt();
			System.out.println("Enter second numbers");
			int b = input.nextInt();

			Sum_Of_Numbers obj = new Sum_Of_Numbers();

			System.out.println("The sum is: " + obj.SumOfNumbers(a, b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int SumOfNumbers(int a, int b) {
		return a + b;
	}

}