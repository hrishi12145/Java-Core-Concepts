package com.virtusa.ex2;
/*
 * Find Sum of Digits of Given Number
 */
import java.util.*;

public class SumOfOddDigits {
	public static void main(String args[]) {
		System.out.println("Enter a number :");
		try (Scanner input = new Scanner(System.in)) {
			int number = input.nextInt();
			int sum = 0;
			if (number < 0) {
				System.out.println("Enter a positive number");
			}
			if (number >= 1) {
				for (; number > 0; number = number / 10) {
		            int rem = number % 10;
		            if (rem % 2 != 0) {
		                sum = sum + rem;
		            }
				}

			}
			System.out.println("Sum Of Odd Digits " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
