package com.virtusa.ex9.forloop;

import java.util.Scanner;

/*
 * prime numbers a number that can be divided exactly only by itself and 1
 */
public class PrimeNo {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number till you want prime number :");
			int number = input.nextInt();
			int tempVariable = 0;
			System.out.println("Prime no from 1 to "+number+" are : ");
			// for loop is for traversing the no till i want prime numbers
			for (int i = 1; i <= number; i++) {
				// checking if the number is prime number or not
				for (int j = 2; j <= i - 1; j++) {
					if (i % j == 0) {
						tempVariable = tempVariable + 1;
					}
				}
				// if tempVar == 0 then this number is Prime no
				if (tempVariable == 0) {
					if(i==1) {
						continue;
					}
					System.out.print(i + " ");
				} else {
					tempVariable = 0;
				}
			}
		}

	}

}
