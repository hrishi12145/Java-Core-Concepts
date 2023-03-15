package com.virtusa.ex9.forloop;

public class SumOfNumbers {
	static int sum = 0;

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			sum += i;

		}
		System.out.println("The Sum of first 10 natural number are : "+sum);
	}

}
